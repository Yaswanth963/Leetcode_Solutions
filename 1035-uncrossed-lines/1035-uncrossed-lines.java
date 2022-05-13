class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m= nums1.length, n = nums2.length;
        int dp[][]= new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(nums1[i-1]==nums2[j-1])
                    dp[i][j]=Math.max(dp[i][j],1+dp[i-1][j-1]);
                else dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        return dp[m][n];
    }
}

//Memoization
// class Solution {
//     public int maxUncrossedLines(int[] nums1, int[] nums2) {
//         int max =0,res=0;
//         int dp[][]= new int[nums1.length][nums2.length];
//         for(int d[]:dp)
//             Arrays.fill(d,-1);
//         res = fun(0,0,nums1,nums2,dp);
//         return res;
//     }
    
//     int fun(int i, int k,int a[], int b[],int dp[][]){
//         if(i==a.length || k==b.length)
//             return 0;
//         if(dp[i][k]!=-1)
//             return dp[i][k];
//         int max=0,res1=0,res2=0;
//         for(int j=k;j<b.length;j++){
//             if(a[i]==b[j]){
                    // including and excluding
//                res1 = Math.max(1+fun(i+1,j+1,a,b,dp),fun(i+1,k,a,b,dp));
//             }else if(j==b.length-1)
                    //handling non-matching case and if the element is at last
//                 res2= fun(i+1,k,a,b,dp);
//             max=Math.max(max,Math.max(res1,res2));
//         }
//         return dp[i][k]=max;
//     }
// }