class Solution {
    public int uniquePaths(int m, int n) {
        return fun(0,0,m,n);
    }
    
    int fun(int s, int e, int m, int n){
        int dp[][] = new int[m][n];
        int left,top;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
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


//Memoization
// class Solution {
//     public int uniquePaths(int m, int n) {
//         int dp[][]= new int[m][n];
//         for(int a[]:dp)
//             Arrays.fill(a,-1);
//         return fun(0,0,m-1,n-1,dp);
//     }
    
//     int fun(int i,int j, int m, int n, int dp[][]){
//         if(i==m && j==n)
//             return 1;
//         if(i>m || j>n)
//             return 0;
//         int right,bott;
//         if(j+1<=n && dp[i][j+1]!=-1)
//             right= dp[i][j+1];
//         else
//          right = fun(i,j+1,m,n,dp);
        
//         if(i+1<=m && dp[i+1][j]!=-1)
//             bott = dp[i+1][j];
//         else
//          bott = fun(i+1,j,m,n,dp);
        
//         return dp[i][j] = right + bott;
//     }
// }