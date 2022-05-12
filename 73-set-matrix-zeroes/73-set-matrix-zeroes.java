class Solution {
    public void setZeroes(int[][] mat) {
        int m = mat.length,n = mat[0].length;
        boolean row=false,col=false;
        if(mat[0][0]==0){
            col=true;
            row=true;
        }
        else{    
            
        for(int i=0;i<n;i++)
            if(mat[0][i]==0)
                row=true;
            
        for(int i=0;i<m;i++)
            if(mat[i][0]==0)
                col=true;
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    mat[i][0]=0;
                    mat[0][j]=0;
                }
            }
        }
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(mat[i][0]==0 || mat[0][j]==0)
                    mat[i][j]=0;
            }
        }
        
        if(col)
            for(int i=0;i<m;i++)
                mat[i][0]=0;
        if(row)
            for(int i=0;i<n;i++)
                mat[0][i]=0;
    }
}