class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n= nums.length;
        return fun(n-1,0,target,nums);
    }
    
    int fun(int i, int sum,int target, int nums[]){
        if(i<0){
            if(sum==target)
                return 1;
            return 0;
        }
        int pos = fun(i-1,sum+nums[i],target,nums);
        int neg = fun(i-1,sum-nums[i],target,nums);
        return pos+neg;
    }
}