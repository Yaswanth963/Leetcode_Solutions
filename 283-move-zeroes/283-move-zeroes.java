class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,t=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                t=nums[j];
                nums[j]=nums[i];
                nums[i]=t;
                i++;
            }
        }
    }
}