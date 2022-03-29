class Solution {
    public int coinChange(int[] coins, int amount) {
        int n= coins.length;
        int dp[][]= new int[n][amount+1];
        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0)
                dp[0][i]=i/coins[0];
            else dp[0][i]= (int) 1e9;
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=amount;j++){
                int pick = Integer.MAX_VALUE;
                if(coins[i]<=j)
                    pick = 1+dp[i][j-coins[i]];
                int unpick = dp[i-1][j];
                dp[i][j] = Math.min(pick,unpick);
            }
        }
        if(dp[n-1][amount]==(int)1e9)
            return -1;
        return dp[n-1][amount];
    }
}

// class Solution {
//     public int coinChange(int[] coins, int amount) {
//         int dp[][]= new int[coins.length][amount+1];
//         for(int a[]:dp)
//         Arrays.fill(a,-1);
//         int res = fun(coins.length-1,amount,coins,dp);
//         return res!=(int) 1e8?res:-1;
//     }
//     Memoization
//     int fun(int index, int amount,int coins[],int dp[][]){
//         if(index==0){
//             if(amount%coins[0]==0)
//                 return amount/coins[index];
//             else return (int) 1e8;
//         }        
//         if(dp[index][amount]!=-1)
//             return dp[index][amount];
//         int pick = Integer.MAX_VALUE;
//         if(coins[index]<=amount)
//         pick = 1 + fun(index,amount-coins[index],coins,dp);
//         int unpick = fun(index-1,amount,coins,dp);
//         return dp[index][amount] = Math.min(pick,unpick);
//     }
// }


