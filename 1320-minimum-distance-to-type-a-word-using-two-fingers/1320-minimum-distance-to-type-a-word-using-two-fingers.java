class Solution {
    public int minimumDistance(String word) {
        int min = Integer.MAX_VALUE;
        int dp[][][]= new int[26][26][300];
        for(int ddd[][]:dp){
            for(int dd[]:ddd){
                Arrays.fill(dd,-1);
            }
        }
        for(int i=0;i<26;i++){
            for(int j=0;j<26;j++){
                min= Math.min(min,find(i,j,word,0,dp));
            }
        }
        return min;
    }
    
    int find(int f1, int f2,String word,int i, int dp[][][]){
        if(i==word.length())
            return 0;
        if(dp[f1][f2][i]!=-1)
            return dp[f1][f2][i];
        int curr = word.charAt(i)-'A';
        int pos[]=getPos(curr);
        int res1=calc(getPos(f1),pos)+find(curr,f2,word,i+1,dp);
        int res2=calc(getPos(f2),pos)+find(f1,curr,word,i+1,dp);
        return dp[f1][f2][i]=Math.min(res1,res2);
    }
    
    int calc(int a[] , int b[]){
        return Math.abs(a[0]-b[0]) + Math.abs(a[1]-b[1]);
    }
    
    int[] getPos(int val){
        return new int[]{val/6,val%6};
    }
}

