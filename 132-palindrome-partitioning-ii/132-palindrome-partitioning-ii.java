class Solution {
    public int minCut(String s) {
        int len = s.length();
        int dp[]= new int[len];
        Arrays.fill(dp,-1);
        return fun(0,s,dp,len)-1;
    }
    
    int fun(int i, String s, int dp[], int n){
        if(i>=n)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        int min =Integer.MAX_VALUE;
        String t="";
        for(int j=i;j<n;j++){
            if(isPalind(i,j,s)){
                min = Math.min(min,1+fun(j+1,s,dp,n));
            }
        }
        return dp[i]=min;
    }
    
    boolean isPalind(int l, int r,String s){
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }    
}
