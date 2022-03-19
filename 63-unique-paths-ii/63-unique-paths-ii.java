class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length,n=obstacleGrid[0].length;  
        if(obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1)
            return 0;
         int dp[][]= new int[m][n];
        for(int a[]:dp)
            Arrays.fill(a,-1);
        return fun(0,0,m-1,n-1,dp,obstacleGrid);
    }
    
    int fun(int i,int j, int m, int n, int dp[][],int mat[][]){
        if(i==m && j==n)
            return 1;
        if(i>m || j>n || mat[i][j]==1)
            return 0;
        int right,bott;
        if(j+1<=n && dp[i][j+1]!=-1)
            right= dp[i][j+1];
        else
         right = fun(i,j+1,m,n,dp,mat);
        
        if(i+1<=m && dp[i+1][j]!=-1)
            bott = dp[i+1][j];
        else
         bott = fun(i+1,j,m,n,dp,mat);
        
        return dp[i][j] = right + bott;
    }
}



//Dp
// class Solution {
//     public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//         int m=obstacleGrid.length,n=obstacleGrid[0].length;
//          int dp[][] = new int[m][n];
//         int left,top;
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(obstacleGrid[i][j]==1)
//                     dp[i][j]=0;
//                 else
//                 if(i==0 && j==0)
//                     dp[0][0]=1;
//                 else{
//                     if(j-1>=0)
//                     left= dp[i][j-1];
//                 else
//                     left = 0;
//                 if(i-1>=0)
//                     top = dp[i-1][j];
//                 else
//                     top =0;
//             dp[i][j] = top+left;
//                 }
//             }
//         }
//         return dp[m-1][n-1];
//     }
// }
