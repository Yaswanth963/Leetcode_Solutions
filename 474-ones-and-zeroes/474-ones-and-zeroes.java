class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
       int len = strs.length;
        int dp[][]= new int[m+1][n+1];
        for(int i=0;i<len;i++){
            int res[]= valid(strs[i],m,n);
            // we do this to check if our required zeros are greater than available
            for(int z=m;z>=res[0];z--){
                for(int o=n;o>=res[1];o--){
                    int incl = 1+dp[z-res[0]][o-res[1]];
                    int excl = dp[z][o];
                    dp[z][o] = Math.max(incl,excl);
                }
            }
        }
        return dp[m][n];
    }
    
        int[] valid(String s, int m, int n){
        int ones=0,zeros=0;
        for(char ch:s.toCharArray()){
            if(ch=='0')
                zeros++;
            else
                ones++;
        }
        return new int[]{zeros,ones};
    }
}


//memoization
// class Solution {
//     public int findMaxForm(String[] strs, int m, int n) {
//         int dp[][][]= new int[m+1][n+1][strs.length];
//         return fun(0,strs,m,n,dp);
//     }
    
//     int fun(int i, String a[], int m, int n, int dp[][][]){
//         if(i==a.length || m+n==0){
//             return 0;
//         }
//         if(dp[m][n][i]!=0)
//             return dp[m][n][i];
//         int res[]=valid(a[i],m,n);
//         int z = res[0];
//         int o = res[1];
//         int incl =0;
//         if(m>=z && n>=o){
//              incl = 1+fun(i+1,a,m-z,n-o,dp);
//         }
//         int excl = fun(i+1,a,m,n,dp);
//         return dp[m][n][i]=Math.max(incl,excl);
//     }
    
//     int[] valid(String s, int m, int n){
//         int ones=0,zeros=0;
//         for(char ch:s.toCharArray()){
//             if(ch=='0')
//                 zeros++;
//             else
//                 ones++;
//         }
//         return new int[]{zeros,ones};
//     }
// }
