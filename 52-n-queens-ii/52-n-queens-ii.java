class Solution {
    static int global;
    public int totalNQueens(int n) {
        solveNQueens(n);
        return global;
    }
    
    public void solveNQueens(int n) {
        global=0;
        char ch[][]= new char[n][n];
        for(char c[]:ch)
            Arrays.fill(c,'.');
        canplace(0,ch,n);
    }
    
    public void canplace(int col,char ch[][],int n){
        if(col==n){
            global++;
            return;
        }
        for(int i=0;i<ch.length;i++){
            if(isValid(i,col,ch)){
                ch[i][col]='Q';
                canplace(col+1,ch,n);
            }
            ch[i][col]='.';
        }
    }
    
    
    public boolean isValid(int row,int col,char c[][]){
        int i,j;
        
        //check in same row
        i=row;j=col;
        while(j-->0)
            if(c[i][j]=='Q')
                return false;
            
        //check diagonally top left
        i=row;j=col;
        while(i-->0 && j-->0)
            if(c[i][j]=='Q')
                return false;
        
        //check diagonally bottom left
        i=row;j=col;
        while(i++<c.length-1 && j-->0)
            if(c[i][j]=='Q')
                return false;
        
        return true;
    }
}