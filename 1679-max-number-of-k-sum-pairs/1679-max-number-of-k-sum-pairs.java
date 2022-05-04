class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int c=0;
        for(int in:nums){
            if(map.getOrDefault(k-in,0)>0){
                c++;
                map.put(k-in,map.get(k-in)-1);
            }else
                 map.put(in,map.getOrDefault(in,0)+1);
        }
        return c;
    }
}