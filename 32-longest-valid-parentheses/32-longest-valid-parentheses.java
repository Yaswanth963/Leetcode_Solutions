//Dp solution
// class Solution {
//     public int longestValidParentheses(String s) {
//         int n = s.length(),max=0;
//         int dp[] = new int[n];
//         for(int i=1;i<n;i++){
//             if(s.charAt(i)==')'){
//          checking if prev character is (
//                 if(s.charAt(i-1)=='(')
//                     dp[i]=(i>=2?dp[i-2]:0)+2;
//              if prev is ) go to ( if available and update dp[i]
//                 else if(i-dp[i-1]>0 && s.charAt(i-dp[i-1]-1)=='('){
//                         dp[i] = dp[i-1] + (i-dp[i-1]>=2?dp[i-dp[i-1]-2]:0)+2;
//                 }
//             }
//             max=Math.max(max,dp[i]);
//         }
//         return max;
//     }
// }


//Two pointers approach
class Solution {
    public int longestValidParentheses(String s) {
        int left=0,right=0,max=0,n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='(')
                left++;
            else
                right++;
            if(left==right)
                max=Math.max(max,right*2);
            else if(right>=left){
                left=0;right=0;
            }
        }
        left=right=0;
        for(int i=n-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch=='(')
                left++;
            else
                right++;
            if(left==right)
                max=Math.max(max,right*2);
            else if(left>=right){
                left=0;right=0;
            }
        }
        return max;
    }
}
