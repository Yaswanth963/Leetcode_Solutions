class Solution {
        int dir[][]= {{0,1},{0,-1},{1,0},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};
    public int shortestPathBinaryMatrix(int[][] grid) {
        int m=grid.length, n = grid[0].length;
        if(grid[0][0]==1 || grid[m-1][n-1]==1)
            return -1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        boolean visited[][] = new boolean[m][n];
        visited[0][0]=true;
        int min=Integer.MAX_VALUE,cn=0;
        while(!q.isEmpty()){
            int size = q.size();
            cn++;
            while(size-->0){
            int poll[]= q.poll();
            int x = poll[0];
            int y= poll[1];
            if(x==m-1 && y==n-1)
                min=Math.min(min,cn);
            for(int in[]:dir){
                int xx = in[0]+x;
                int yy = in[1]+y;
                if(xx>=0 && xx<m && yy>=0 && yy<n && grid[xx][yy]==0 && !visited[xx][yy]){
                    q.add(new int[]{xx,yy});
                    visited[xx][yy]=true;
                }
            }   
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}