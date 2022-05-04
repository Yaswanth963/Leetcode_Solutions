class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length(),n = s2.length(),l=s3.length();
        if(m+n!=l)
            return false;
        int dp[][][]= new int[m][n][l];
        for(int d[][]:dp){
            for(int in[]:d)
            Arrays.fill(in,-1);
        }
        return fun(0,0,0,s1,s2,s3,dp)==0?false:true;
    }
    int fun(int i, int j, int k, String r,String s, String t,int dp[][][]){
        if(k==t.length() && i==r.length() && j==s.length())
            return 1;
        if(i==r.length())
            return s.substring(j).equals(t.substring(k))?1:0;
        if(j==s.length())
            return r.substring(i).equals(t.substring(k))?1:0;
        if(dp[i][j][k]!=-1)
            return dp[i][j][k];
        if( t.charAt(k)==r.charAt(i) && t.charAt(k)==s.charAt(j))
            return dp[i][j][k]= (fun(i+1,j,k+1,r,s,t,dp) | fun(i,j+1,k+1,r,s,t,dp));
        else if(t.charAt(k)==r.charAt(i)){
            return dp[i][j][k]=fun(i+1,j,k+1,r,s,t,dp);
        }else if(t.charAt(k)==s.charAt(j)){
            return dp[i][j][k]=fun(i,j+1,k+1,r,s,t,dp);
        }
        return 0;
    }
}