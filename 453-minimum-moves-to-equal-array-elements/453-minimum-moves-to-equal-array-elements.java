class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for(int in:nums)
            res+=in-nums[0];
        return res;
    }
}