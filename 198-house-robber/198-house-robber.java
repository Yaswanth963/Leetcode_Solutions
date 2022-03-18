class Solution {
    public int rob(int[] nums) {
        int dp[]= new int[nums.length];
        Arrays.fill(dp,-1);
        return fun(nums.length-1,nums,dp);
    }
    
    public int fun(int n,int nums[],int dp[]){
        if(n<0) return 0;
        if(n==0) return nums[0];
        if(dp[n]!=-1)
            return dp[n];
        return dp[n] = Math.max(nums[n]+fun(n-2,nums,dp),fun(n-1,nums,dp));
    }
}