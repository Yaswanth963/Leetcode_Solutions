class Solution {
    public int minMoves(int[] nums) {
        int min =Integer.MAX_VALUE;
        int sum=0,c=0;
        for(int in:nums){
            sum+=in;
            min=Math.min(min,in);
            c++;
        }
        return sum-(min*c);
    }
}