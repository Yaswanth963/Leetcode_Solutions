class Solution {
    public int numDistinct(String s, String t) {
        int m= s.length(), n = t.length();
        int dp[][] = new int[m][n];
        for(int a[]:dp)
        Arrays.fill(a,-1);
        return dis(0,0,s,t,dp);        
    }
    
    int dis(int i, int j, String s, String t,int dp[][]){
        if(j==t.length())
            return 1;
        if(i==s.length())
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(s.charAt(i) == t.charAt(j))
            return dp[i][j] =dis(i+1,j+1,s,t,dp) + dis(i+1,j,s,t,dp);
        else return dp[i][j] = dis(i+1,j,s,t,dp);
    }
}