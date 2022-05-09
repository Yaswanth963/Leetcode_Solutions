class Solution {
    public double largestSumOfAverages(int[] nums, int k) {
        double dp[][] = new double[nums.length][k+1];
        for(double d[]:dp)
            Arrays.fill(d,-1);
        return fun(0,nums,k,dp);
    }
    
    double fun(int i, int a[], int k,double dp[][]){
        if(i==a.length)
            return 0;
        if(k==0)
            return -10000000;
        if(dp[i][k]!=-1)
            return dp[i][k];
        double max=0.0,sum=0;
        for(int j=i;j<a.length;j++){
            sum+=a[j];
            double avg = sum/(j-i+1);
            max=Math.max(max,avg+fun(j+1,a,k-1,dp));
        }
        return dp[i][k]=max;
    }
}



   
