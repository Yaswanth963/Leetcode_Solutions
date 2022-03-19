class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]= new int[m][n];
        for(int a[]:dp)
            Arrays.fill(a,-1);
        return fun(0,0,m-1,n-1,dp);
    }
    
    int fun(int i,int j, int m, int n, int dp[][]){
        if(i==m && j==n)
            return 1;
        if(i>m || j>n)
            return 0;
        int right,bott;
        if(j+1<=n && dp[i][j+1]!=-1)
            right= dp[i][j+1];
        else
         right = fun(i,j+1,m,n,dp);
        
        if(i+1<=m && dp[i+1][j]!=-1)
            bott = dp[i+1][j];
        else
         bott = fun(i+1,j,m,n,dp);
        
        return dp[i][j] = right + bott;
    }
}