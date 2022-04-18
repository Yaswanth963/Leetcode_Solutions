class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    c++;
                    bfs(grid,i,j);
                }
            }
        }
        return c;
    }
    
    void bfs(char g[][], int i, int j){
        if(i<0 || i>=g.length || j<0 || j>=g[0].length || g[i][j]=='0')
            return;
        g[i][j]='0';
        bfs(g,i+1,j);
        bfs(g,i,j+1);
        bfs(g,i-1,j);
        bfs(g,i,j-1);
    }
}