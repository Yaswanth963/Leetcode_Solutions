class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length,n= grid[0].length;
        int dp[][]= new int[m][n];
        for(int a[]:dp)
            Arrays.fill(a,-1);
        return fun(m-1,n-1,grid,dp);
    }
    
    int fun(int i, int j, int mat[][], int dp[][]){
        if(i<0 || j<0 )
            return Integer.MAX_VALUE;
        if(i==0 && j==0)
            return mat[i][j];
        int res = mat[i][j];
        int left,top;
        if(j-1 >=0 && dp[i][j-1]!=-1)
            left = dp[i][j-1];
        else 
            left = fun(i,j-1,mat,dp);
        if(i-1>=0 && dp[i-1][j]!=-1)
            top = dp[i-1][j];
        else 
            top = fun(i-1,j,mat,dp);
        return dp[i][j] = res+Math.min(left,top);
    }
}