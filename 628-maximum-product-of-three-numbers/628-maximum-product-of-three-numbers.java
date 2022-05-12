class Solution {
    public int maximumProduct(int[] nums) {
        int min1,min2,max1,max2,max3;
        min1=min2=Integer.MAX_VALUE;
        max1=max2=max3=Integer.MIN_VALUE;
        for(int in:nums){
            if(in>max1){
                max3=max2;
                max2=max1;
                max1=in;
            }else if(in>max2){
                max3=max2;
                max2=in;
            }else if(in>max3)
                max3=in;
            if(in<min1){
                min2=min1;
                min1=in;
            }else if(in<min2){
                min2=in;
            }
        }
        return Math.max(min1*min2*max1,max1*max2*max3);
    }
}



// class Solution {
//     public int maximumProduct(int[] nums) {
//         Arrays.sort(nums);
//         int l=nums.length-1;
//         return Math.max(nums[0]*nums[1]*nums[l],nums[l]*nums[l-1]*nums[l-2]);
//     }
// }