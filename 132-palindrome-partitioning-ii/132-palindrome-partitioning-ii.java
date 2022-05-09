class Solution {
    public int minCut(String s) {
        int len = s.length();
        int dp[]= new int[len];
        Arrays.fill(dp,-1);
        return fun(0,s,dp,len);
    }
    
    int fun(int i, String s, int dp[], int n){
        if(i>=n)
            return 0;
        if(isPalind(s.substring(i,n)))
            return dp[i]=0;
        if(dp[i]!=-1)
            return dp[i];
        int min =Integer.MAX_VALUE;
        String t="";
        for(int j=i;j<n;j++){
            t+=s.charAt(j);
            if(isPalind(t)){
                min = Math.min(min,1+fun(j+1,s,dp,n));
            }
        }
        return dp[i]=min;
    }
    
    boolean isPalind(String s){
        int l=0,r=s.length()-1;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }    
}
