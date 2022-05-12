class Solution {
    public void sortColors(int[] nums) {
       int l=0,m=0,h=nums.length-1,t=0;
        while(m<=h){
            if(nums[m]==2){
            t=nums[h];
            nums[h]=nums[m];
            nums[m]=t;
            h--;
        }
        else if(nums[m]==0){
            t=nums[m];
            nums[m]=nums[l];
            nums[l]=t;
            l++;
            m++;
        }else
            m++;
        }
    }
}