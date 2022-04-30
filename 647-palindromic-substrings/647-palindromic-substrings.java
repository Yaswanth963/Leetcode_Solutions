class Solution {
    public int countSubstrings(String s) {
        int len = s.length();
        int dp[][]= new int[len][len];
        int sum=0;
        for(int k=0;k<len;k++){
            for(int i=0,j=k+i;j<len;j++,i++){
                if(j-i==0)
                    dp[i][j]=1;
                else if(j-i==1)
                    dp[i][j]=s.charAt(i)==s.charAt(j)?1:0;
                else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==1)
                        dp[i][j]=1;
                }
                sum+=dp[i][j];
            }
        }
        return sum;
    }
}