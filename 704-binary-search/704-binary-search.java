class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums,0,nums.length-1,target);
    }
    
    public int binarySearch(int a[],int start, int end, int target){
        if(start<=end){
        int mid = start+(end-start)/2;
        if(a[mid]==target)
            return mid;
        else if(a[mid]<target)
            return binarySearch(a,mid+1,end,target);
        return binarySearch(a,start,mid-1,target);
        }
        return -1;
    }
}