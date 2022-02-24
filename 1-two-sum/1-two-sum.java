class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<len;i++){
            int remain = target-nums[i];
            if(map.containsKey(remain))
                return new int[]{map.get(remain),i};
            else
                map.put(nums[i],i);
        }
        return null;
    }
}