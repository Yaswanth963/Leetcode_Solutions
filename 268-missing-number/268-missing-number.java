//Using XOR property of numbers
class Solution {
    public int missingNumber(int[] nums) {
        int res =0;
        for(int i=1;i<=nums.length;i++){
            res^=i;
            res^=nums[i-1];
        }
        return res;
    }
}


//Using sum of first n natural numbers formula
// class Solution {
//     public int missingNumber(int[] nums) {
//         int actsum=(nums.length*(nums.length+1))/2;
//         int cursum=0;
//         for(int i=0;i<nums.length;i++){
//             cursum+=nums[i];
//         }
//         return actsum-cursum;
        
//     }
// }