class Solution {
    //Tabulation
    public int rob(int[] nums) {
        int len= nums.length;
        int dp[]= new int[len];
        dp[0]=nums[0];
        for(int i=1;i<len;i++){
            int take = nums[i];
            if(i>1)
            take+= dp[i-2];
            int not_take = dp[i-1];
            dp[i] = Math.max(take,not_take); 
        }
        return dp[len-1];
    }
}




//Memoization
// class Solution {
//     public int rob(int[] nums) {
//         int dp[]= new int[nums.length];
//         Arrays.fill(dp,-1);
//         return fun(nums.length-1,nums,dp);
//     }
    
//     public int fun(int n,int nums[],int dp[]){
//         if(n<0) return 0;
//         if(n==0) return nums[0];
//         if(dp[n]!=-1)
//             return dp[n];
//         return dp[n] = Math.max(nums[n]+fun(n-2,nums,dp),fun(n-1,nums,dp));
//     }
// }