class Solution {
    public boolean divisorGame(int n) {
        if(n==1)
            return false;
        boolean dp[]= new boolean[n+1];
        for(int i=2;i<=n;i++){
            for(int j=1;j<=(int)Math.sqrt(i);j++){
                if(i%j==0 && !dp[i-j])
                    dp[i]=true;
            }
        }
        return dp[n];
    }
}