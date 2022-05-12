class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE, sum = 0, n = nums.length;
        for (int num : nums)
        {
            min = Math.min(num, min);
            sum += num;
        }
        
        return sum - n*min;
    }
}