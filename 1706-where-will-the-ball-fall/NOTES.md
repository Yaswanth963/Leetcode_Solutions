For each cell we check if we can move to next row just by checking with next cell in the same row. i.e if mat[i][j]==1 then mat[i][j+1] must be 1. So ball can move to next row. similarly if mat[i][j]==-1 then mat[i][j-1] must be -1. We handle the boundary values and recursively move to next rows till we move out of the grid.