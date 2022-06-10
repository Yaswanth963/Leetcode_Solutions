class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l,r,max=0;
        l=r=0;
        Map<Character,Integer>map= new HashMap<>();
        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
                //checking the current character position
//i.e if the current character is present in the current window or not in the window boundary
                l=Math.max(map.get(s.charAt(r))+1,l);
            }
            map.put(s.charAt(r),r);
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}