class Solution {
    static List<List<String>>global;
    public List<List<String>> solveNQueens(int n) {
        global= new ArrayList<>();
        char ch[][]= new char[n][n];
        for(char c[]:ch)
            Arrays.fill(c,'.');
        canplace(0,ch,n);
        return global;
    }
    
    public void canplace(int col,char ch[][],int n){
        if(col==n)
            return;
        for(int i=0;i<ch.length;i++){
            if(isValid(i,col,ch)){
                ch[i][col]='Q';
                if(col==n-1)
                    addGlobal(ch);
                canplace(col+1,ch,n);
            }
            ch[i][col]='.';
        }
    }
    
    public void addGlobal(char c[][]){
        List<String>t= new ArrayList<>();
        for(int i=0;i<c.length;i++){
            String temp="";
            for(int j=0;j<c[0].length;j++){
                temp+=c[i][j];
            }
            t.add(temp);
        }
        global.add(t);
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