class Solution {
    public int maxSubArray(int[] nums) {
        int currmax=0,maxsofar=nums[0];
        for(int i=0;i<nums.length;i++){
            currmax+=nums[i];
            maxsofar=Math.max(currmax,maxsofar);
            if(currmax<0)
                currmax=0;
        }
        return maxsofar;
    }
}