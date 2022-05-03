class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int a[]=Arrays.copyOfRange(nums,0,nums.length);
        Arrays.sort(a);
        int c=0;
        int first=-1,second=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=a[i]){
                if(first==-1)
                    first=i;
                else
                    second=i;
            }
        }
        return first==-1?0:second-first+1;
    }
}