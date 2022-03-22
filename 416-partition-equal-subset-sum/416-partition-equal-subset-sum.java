import java.util.stream.*;
class Solution {
    public boolean canPartition(int[] nums) {
        int sum=Arrays.stream(nums).sum();
        if(sum%2!=0)
            return false;
        Boolean dp[][]= new Boolean[nums.length][sum/2 +1];
        return fun(0,sum/2,nums,dp);
    }
    
    boolean fun(int i, int sum, int nums[],Boolean[][] dp){
        if(sum==0)
            return true;
        else if(i==nums.length-1)
            return nums[i]==sum;
        if(dp[i][sum]!=null)
            return dp[i][sum];
        Boolean incl=false,excl=false;
        if(nums[i]<=sum)
        incl = fun(i+1,sum-nums[i],nums,dp);
        excl = fun(i+1,sum,nums,dp);
        return dp[i][sum] = incl || excl;
    }
}