import java.util.*;
class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = Arrays.stream(nums).sum()-x;
        Map<Integer,Integer> map = new HashMap<>();
        int n =  nums.length;
        int max=-1,curr=0;
        for(int i=0;i<n;i++){
            curr+=nums[i];
            map.put(curr,i);
            int remain = curr-sum;
            if(curr==sum)
                max=Math.max(max,i+1);
            if(map.containsKey(remain)){
                max=Math.max(max,i-map.get(remain));
            }
        }
        return max==-1?-1:n-max;
    }
}



//         for(int i=0;i<n;i++){
//             int remain = pre[i]-sum;
//             if(pre[i]==sum)
//                 max=Math.max(max,i+1);
//             if(map.containsKey(remain)){
//                 max=Math.max(max,i-map.get(remain));
//             }
//         }
//         return max==-1?-1:n-max;
//     }
// }