import java.util.Map.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int a[] = new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        for(int in:nums)
            map.put(in,map.getOrDefault(in,0)+1);
        List<Entry<Integer,Integer>> al = new ArrayList<>(map.entrySet());
		Collections.sort(al,(o1,o2)->o2.getValue()-o1.getValue());
        for(int i=0;i<k;i++)
            a[i]=al.get(i).getKey();
        return a;
    }
}