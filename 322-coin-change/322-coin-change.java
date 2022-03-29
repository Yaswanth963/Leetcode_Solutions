class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][]= new int[coins.length][amount+1];
        for(int a[]:dp)
        Arrays.fill(a,-1);
        int res = fun(coins.length-1,amount,coins,dp);
        return res!=(int) 1e8?res:-1;
    }
    
    int fun(int index, int amount,int coins[],int dp[][]){
        if(index==0){
            if(amount%coins[0]==0)
                return amount/coins[index];
            else return (int) 1e8;
        }        
        if(dp[index][amount]!=-1)
            return dp[index][amount];
        int pick = Integer.MAX_VALUE;
        if(coins[index]<=amount)
        pick = 1 + fun(index,amount-coins[index],coins,dp);
        int unpick = fun(index-1,amount,coins,dp);
        return dp[index][amount] = Math.min(pick,unpick);
    }
}