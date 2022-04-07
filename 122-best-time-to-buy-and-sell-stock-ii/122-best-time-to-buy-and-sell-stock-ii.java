class Solution {
    public int maxProfit(int[] prices) {
        int len =prices.length;
        int dp[][]= new int[len+1][2];
        dp[len][0]=dp[len][1]=0;
        for(int i=len-1;i>=0;i--){
            for(int j=0;j<=1;j++){
              if(j==1){
            int buy = -prices[i]+dp[i+1][0];
            int notbuy = dp[i+1][1];
            dp[i][j] = Math.max(buy,notbuy);
            }
            else{
            int sell = prices[i]+dp[i+1][1];
            int notsell = dp[i+1][0];
            dp[i][j] = Math.max(sell,notsell);
        }  
                 
            }
        }
        return dp[0][1];
    }
}


// class Solution {
//     public int maxProfit(int[] prices) {
//         int dp[][]= new int[prices.length][2];
//         for(int a[]:dp)
//             Arrays.fill(a,-1);
//         return fun(0,prices,1,dp);
//     }
    
//     int fun(int i,int prices[],int canBuy,int[][] dp){
//         if(i==prices.length)
//             return 0;
//         if(dp[i][canBuy]!=-1)
//             return dp[i][canBuy];
//         if(canBuy==1){
//             int buy = -prices[i]+fun(i+1,prices,1-canBuy,dp);
//             int notbuy = fun(i+1,prices,canBuy,dp);
//             return dp[i][canBuy] = Math.max(buy,notbuy);
//         }else{
//             int sell = prices[i]+fun(i+1,prices,1-canBuy,dp);
//             int notsell = fun(i+1,prices,canBuy,dp);
//             return dp[i][canBuy] = Math.max(sell,notsell);
//         }
//     }
// }