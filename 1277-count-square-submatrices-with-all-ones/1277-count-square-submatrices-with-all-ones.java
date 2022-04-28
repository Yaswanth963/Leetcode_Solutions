class Solution {
    public int countSquares(int[][] matrix) {
        int n= matrix[0].length,m=matrix.length;
        int max=0;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0)
                    dp[i][j]=matrix[i][j];
                else if(matrix[i][j]==1)
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]));
                max+=dp[i][j];
            }
        }
        return max;
    }
}