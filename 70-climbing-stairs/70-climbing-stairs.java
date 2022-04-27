class Solution {
    public int climbStairs(int n) {
        if(n<=2)
            return n;
        int curr =2,prev=1,res=0;
        for(int i=3;i<=n;i++){
            res=curr+prev;
            prev=curr;
            curr=res;
        }
        return curr;
    }
}