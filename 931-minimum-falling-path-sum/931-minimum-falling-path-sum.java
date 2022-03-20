import java.util.stream.*;
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length,n=matrix[0].length;
        int dp[][]= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0)
                    dp[i][j] = matrix[i][j];
                else{
                int right = j+1 <n && i-1>=0 ? dp[i-1][j+1]: (int)1e8;
                int left = i-1>=0 && j-1>=0 ? dp[i-1][j-1]: (int)1e8;
                int top = i-1>=0 ? dp[i-1][j] : (int)1e8;
                dp[i][j] = matrix[i][j]+Math.min(right,Math.min(top,left));
                }
            }
        }
        int min = dp[m-1][0]; 
        for(int in:dp[m-1])
            min=Math.min(min,in);
        return min;
    }
}
                            
//Memoization
// class Solution {
//     public int minFallingPathSum(int[][] matrix) {
//         int m = matrix.length,n=matrix[0].length;
//         int dp[][]= new int[m][n];
//         for(int a[]:dp)
//             Arrays.fill(a,-1);
//         for(int i=0;i<n;i++){
//             int res = fun(m-1,i,m,n,matrix,dp);
//             max=Math.min(max,res);
//         }
//         return max;
//     }
    
//     int fun(int i,int j, int m , int n, int mat[][], int dp[][]){
//         if(i<0 || j<0 || j>=n)
//             return (int)1e8;
//         if(i==0) return mat[i][j];
//         int right,left,top;
//         if(i-1>=0 && j+1 <n && dp[i-1][j+1]!=-1)
//             right = dp[i-1][j+1];
//         else right = fun(i-1,j+1,m,n,mat,dp);
//         if(i-1>=0 && j-1>=0 && dp[i-1][j-1]!=-1)
//             left = dp[i-1][j-1];
//         else left = fun(i-1,j-1,m,n,mat,dp);
//         if(i-1>=0 && dp[i-1][j]!=-1)
//             top = dp[i-1][j];
//         else top = fun(i-1,j,m,n,mat,dp);
//         return dp[i][j] = mat[i][j]+Math.min(right,Math.min(top,left));
//     }
// }