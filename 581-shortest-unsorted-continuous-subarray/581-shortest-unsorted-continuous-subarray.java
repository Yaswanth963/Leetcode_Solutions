public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        boolean flag = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1])
                flag = true;
            if (flag)
                min = Math.min(min, nums[i]);
        }
        flag = false;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1])
                flag = true;
            if (flag)
                max = Math.max(max, nums[i]);
        }
        int l, r;
        for (l = 0; l < nums.length; l++) {
            if (min < nums[l])
                break;
        }
        for (r = nums.length - 1; r >= 0; r--) {
            if (max > nums[r])
                break;
        }
        return r - l < 0 ? 0 : r - l + 1;
    }
}



//T: O(N)   S:O(N)
// class Solution {
//     public int findUnsortedSubarray(int[] nums) {
//         Stack<Integer> st = new Stack<>();
//         int n= nums.length;
//         int min = n,max=0;
//         for(int i=0;i<n;i++){
//             while(!st.isEmpty() && nums[st.peek()]>nums[i])
//                 min=Math.min(min,st.pop());
//             st.push(i);
//         }
        
//         st.clear();
//         for(int i=n-1;i>=0;i--){
//             while(!st.isEmpty() && nums[st.peek()]<nums[i])
//                 max=Math.max(max,st.pop());
//             st.push(i);
//         }
//         return max-min<0?0:max-min+1;
//     }
// }


// O(Nlog N)
// class Solution {
//     public int findUnsortedSubarray(int[] nums) {
//         int a[]=Arrays.copyOfRange(nums,0,nums.length);
//         Arrays.sort(a);
//         int c=0;
//         int first=-1,second=-1;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]!=a[i]){
//                 if(first==-1)
//                     first=i;
//                 else
//                     second=i;
//             }
//         }
//         return first==-1?0:second-first+1;
//     }
// }

