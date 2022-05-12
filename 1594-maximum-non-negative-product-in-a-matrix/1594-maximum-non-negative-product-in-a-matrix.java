class Solution {
    public int maxProductPath(int[][] grid) {
        int m = grid.length,n = grid[0].length;
        int mod = (int)(1e9+7);
        long dp[][][] = new long[m][n][2];
        dp[0][0][0] = dp[0][0][1] = grid[0][0];
        for(int i=1;i<m;i++){
            long prevmax = dp[i-1][0][0];
            long prevmin = dp[i-1][0][1];
            long currmax = Math.max(prevmin*grid[i][0],prevmax*grid[i][0]);
            long currmin = Math.min(prevmin*grid[i][0],prevmax*grid[i][0]);
            dp[i][0] = new long[]{currmax,currmin};
        }
        
        for(int i=1;i<n;i++){
            long prevmax = dp[0][i-1][0];
            long prevmin = dp[0][i-1][1];
            long currmax = Math.max(prevmin*grid[0][i],prevmax*grid[0][i]);
            long currmin = Math.min(prevmin*grid[0][i],prevmax*grid[0][i]);
            dp[0][i] = new long[]{currmax,currmin};
        }
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
            long max1 = Math.max(grid[i][j]*dp[i-1][j][0],grid[i][j]*dp[i-1][j][1]);
            long max2 = Math.max(grid[i][j]*dp[i][j-1][0],grid[i][j]*dp[i][j-1][1]);
                long currmax=Math.max(max1,max2);
            
            long min1 = Math.min(grid[i][j]*dp[i-1][j][0],grid[i][j]*dp[i-1][j][1]);
            long min2 = Math.min(grid[i][j]*dp[i][j-1][0],grid[i][j]*dp[i][j-1][1]);
                long currmin=Math.min(min1,min2);
                
            dp[i][j]=new long[]{currmax,currmin};
            }
        }
        return (int)(dp[m-1][n-1][0]<0?-1:dp[m-1][n-1][0]%mod);
    }
}