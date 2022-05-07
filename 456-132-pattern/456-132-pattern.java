class Solution {
    public boolean find132pattern(int[] nums) {
        int len = nums.length,peak=Integer.MIN_VALUE;
        Stack<Integer> st = new Stack<>();
        for(int i=len-1;i>=0;i--){
           if(nums[i]<peak)
               return true;
            while(!st.isEmpty() && st.peek()<nums[i])
                peak=st.pop();
            st.push(nums[i]);
        }
        return false;
    }
}
