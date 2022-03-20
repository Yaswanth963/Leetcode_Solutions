class Solution {
    public int cherryPickup(int[][] grid) {
        int m= grid.length,n=grid[0].length;
        int dp[][][]= new int[m][m][n];
        return fun(0,0,n-1,m,n,grid,dp);
    }
    
    int fun(int s,int e1, int e2,int m, int n,int mat[][], int dp[][][]){
        if(s==m || e1<0 || e2==n || e1==n || e2<0)
            return (int)-1e8;
        if(dp[s][e1][e2]!=0)
            return dp[s][e1][e2];
        int res=0;
        for(int i=-1;i<2;i++){
            for(int j=-1;j<2;j++){
                res = Math.max(res,fun(s+1,e1+i,e2+j,m,n,mat,dp));
            }
        } 
        res+=mat[s][e1];
        if(e1!=e2)
            res+=mat[s][e2];
        return dp[s][e1][e2]=res;
    }
}