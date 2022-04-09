class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length-1;
        while(n-1 >=0 && nums[n]<=nums[n-1])
            n--;
        if(n==0){
            Arrays.sort(nums);
            return;
        }
        n--;
        int p = nums.length-1;
        while(p>n && nums[p]<=nums[n])
            p--;
        int t=nums[n];
        nums[n] = nums[p];
        nums[p] = t;
        Arrays.sort(nums,n+1,nums.length);
    }
}