class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length,n=obstacleGrid[0].length;
         int dp[][] = new int[m][n];
        int left,top;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(obstacleGrid[i][j]==1)
                    dp[i][j]=0;
                else
                if(i==0 && j==0)
                    dp[0][0]=1;
                else{
                    if(j-1>=0)
                    left= dp[i][j-1];
                else
                    left = 0;
                if(i-1>=0)
                    top = dp[i-1][j];
                else
                    top =0;
            dp[i][j] = top+left;
                }
            }
        }
        return dp[m-1][n-1];
    }
}