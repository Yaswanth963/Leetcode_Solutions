class Solution {
    public int[] findBall(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            a[i]=dfs(0,i,grid);
        }
        return a;
    }
    
    int dfs(int i, int j, int mat[][]){
        if(i>mat.length-1)
            return j;
        int cell = mat[i][j];
        if(cell==1 && j+1<mat[0].length &&mat[i][j+1]==1){
            int res=dfs(i+1,j+1,mat);
             if(res!=-1)
                 return res;
        }else if(cell==-1 && j-1>=0 && mat[i][j-1]==-1){
            int res=dfs(i+1,j-1,mat);
            if(res!=-1)
                return res;
        }
        return -1;
    }
}
