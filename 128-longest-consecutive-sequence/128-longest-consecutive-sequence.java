class Solution {
    public int longestConsecutive(int[] nums) {
        int len = nums.length;
        if(len<=1)
            return len;
        Set<Integer> set = new HashSet<>();
        for(int in:nums)
            set.add(in);
        int c=0,max=1;
        for(Integer i:set){
           if(!set.contains(i-1)){
               int in=i;
                c=1;
            while(set.contains(in+1)){
                c++;
                in+=1;
            }
            max=Math.max(max,c);
           }
        }
        return max;
    }
}