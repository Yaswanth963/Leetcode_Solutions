class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int a1[]= Arrays.copyOfRange(nums,0,nums.length-1);
        int a2[]= Arrays.copyOfRange(nums,1,nums.length);
        return Math.max(rob1(a1),rob1(a2));
    }
    
    int rob1(int nums[]){
        int curr =nums[0],prev=0;
        for(int i=1;i<nums.length;i++){
            int incl = prev+nums[i];
            int excl = curr;
            int res =Math.max(incl,excl);
            prev= curr;
            curr=res;
        }
        return curr;
    }
}

