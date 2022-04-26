class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int resultArray[] = new int[len];
        resultArray[0] = 1;
        int product = 1;
        for(int i=1;i<len;i++){
            product*=nums[i-1];
            resultArray[i]= product;
        }
        
        product = nums[len-1];
        for(int i=len-2;i>=0;i--){
            resultArray[i]*=product;
            product*=nums[i];
        }
        return resultArray;
    }
}

// 4  4  12  24  24  
// 48 16  24  48  24





