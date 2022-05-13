class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int max =0,res=0;
        int dp[][]= new int[nums1.length][nums2.length];
        for(int d[]:dp)
            Arrays.fill(d,-1);
        res = fun(0,0,nums1,nums2,dp);
        return res;
    }
    
    int fun(int i, int k,int a[], int b[],int dp[][]){
        if(i==a.length || k==b.length)
            return 0;
        if(dp[i][k]!=-1)
            return dp[i][k];
        int max=0,res1=0,res2=0;
        for(int j=k;j<b.length;j++){
            if(a[i]==b[j]){
               res1 = Math.max(1+fun(i+1,j+1,a,b,dp),fun(i+1,k,a,b,dp));
            }else if(j==b.length-1)
                res2= fun(i+1,k,a,b,dp);
            max=Math.max(max,Math.max(res1,res2));
        }
        return dp[i][k]=max;
    }
}