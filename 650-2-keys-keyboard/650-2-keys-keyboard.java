class Solution {
    public int minSteps(int n) {
        if(n==1)
            return 0;
        return fun(1,1,n)+1;
    }
    
    int fun(int sc,int buf, int n){
        if(sc==n)
            return 0;
        if(sc>n || buf>n)
            return (int)1e8;
        int cop=(int)1e8;
        if(sc!=buf)
         cop=fun(sc,sc,n);
        int pas = fun(sc+buf,buf,n);
        return Math.min(cop,pas)+1;
    }
}

