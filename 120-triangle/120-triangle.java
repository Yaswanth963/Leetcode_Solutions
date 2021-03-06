class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m= triangle.size();
        int dp[][]= new int[m][m];
        for(int i=m-1;i>=0;i--){
            for(int j=i;j>=0;j--){
                if(i==m-1)
                    dp[i][j]= triangle.get(i).get(j);
                else
                    dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i+1][j],dp[i+1][j+1]);
            }
        }
        return dp[0][0];
    }
}

//Memoization
// class Solution {
//     public int minimumTotal(List<List<Integer>> triangle) {
//         int m= triangle.size();
//         int dp[][]= new int[m][m];
//         for(int d[]:dp)
//             Arrays.fill(d,-1);
//         return fun(0,0,m,triangle,dp);   
//     }
//     int fun(int s, int e, int m,List<List<Integer>> al, int dp[][]){
//         if(s== m-1)
//             return al.get(s).get(e);
//         int bott,diag;
//         if(s+1 <m && dp[s+1][e]!=-1)
//             bott = dp[s+1][e];
//         else bott = fun(s+1,e,m,al,dp);
//         if(s+1< m && dp[s+1][e+1]!=-1)
//             diag = dp[s+1][e+1];
//         else diag = fun(s+1,e+1,m,al,dp);
//         return dp[s][e] = al.get(s).get(e) + Math.min(bott,diag);
//     }
// }