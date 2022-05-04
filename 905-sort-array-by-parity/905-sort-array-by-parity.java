class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0,j=0,len = nums.length,t=0;
        while(j<len){
            if((nums[j]&1)==0){
                t = nums[j];
                nums[j]=nums[i];
                nums[i]=t;
                i++;
            }
            j++;
        }
        return nums;
    }
}