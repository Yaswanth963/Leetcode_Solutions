class Solution {
    public int twoEggDrop(int n) {
        int dp[][]= new int[n+1][3];
        for(int d[]:dp)
            Arrays.fill(d,-1);
        return fun(n,2,dp);
    }
    int fun(int n, int k, int dp[][]){
        if(k==1)
            return n;
        if(n==1)
            return 1;
        if(dp[n][k]!=-1)
            return dp[n][k];
        int min =1000000,max=0;
        for(int i=1;i<=n;i++){
            int top = fun(n-i,k,dp);
            int bot = fun(i-1,k-1,dp);
            max= 1+Math.max(top,bot);
            min=Math.min(min,max);
        }
        return dp[n][k]=min;
    }
}