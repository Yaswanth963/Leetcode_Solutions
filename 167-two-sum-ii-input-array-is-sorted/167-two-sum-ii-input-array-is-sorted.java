class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0,r=numbers.length-1;
        while(l<r){
            int curr = numbers[l]+numbers[r];
            if(curr==target)
                return new int[]{l+1,r+1};
            else if(curr<target)
                l++;
            else r--;
        }
        return new int[]{-1,-1};
    }
}