class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int dp[] = new int[arr.length];
        Arrays.fill(dp,-1);
        return fun(0,arr,k,dp);
    }
    
    int fun(int i, int a[],int k,int dp[]){
        if(i==a.length)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        int sum=0,max=-1,maxi=-1,len=0;
        for(int j=i;j<Math.min(a.length,i+k);j++){
            len++;
            max=Math.max(max,a[j]);
            sum=(len*max) + fun(j+1,a,k,dp);
            maxi=Math.max(maxi,sum);
        }
        return dp[i]=maxi;
    }
}