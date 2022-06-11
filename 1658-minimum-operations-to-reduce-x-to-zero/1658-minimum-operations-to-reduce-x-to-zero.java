import java.util.*;
class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = Arrays.stream(nums).sum()-x;
        Map<Integer,Integer> map = new HashMap<>();
        int n =  nums.length;
        int pre[]= new int[n];
        pre[0]=nums[0];
        for(int i=0;i<n;i++){
            if(i!=0)
                pre[i]+=pre[i-1]+nums[i];
            map.put(pre[i],i);
        }
        int max=-1;
        for(int i=0;i<n;i++){
            int remain = pre[i]-sum;
            if(pre[i]==sum)
                max=Math.max(max,i+1);
            if(map.containsKey(remain)){
                max=Math.max(max,i-map.get(remain));
            }
        }
        return max==-1?-1:n-max;
    }
}


// 1 2 6 8 11