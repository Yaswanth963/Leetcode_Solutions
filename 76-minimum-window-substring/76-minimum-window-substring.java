class Solution {
    public String minWindow(String s, String t) {
        if(s.length() ==0 || t.length()==0)
            return "";
        int res[]={-1,0,0};
        Map<Character,Integer> smap = new HashMap<>();
        Map<Character,Integer> tmap = new HashMap<>();
        for(char ch:t.toCharArray())
            tmap.put(ch,tmap.getOrDefault(ch,0)+1);
        int l=0,r=0;
        int req=tmap.size(),formed=0;
        while(r<s.length()){
            char ch = s.charAt(r);
            smap.put(ch,smap.getOrDefault(ch,0)+1);
            if(tmap.containsKey(ch) && smap.get(ch).intValue()==tmap.get(ch).intValue()){
                formed++;
            }
            while(l<=r && req==formed){
                ch = s.charAt(l);
                if(res[0]==-1 || r-l+1<res[0]){
                    res = new int[]{r-l+1,l,r};
                }
                smap.put(ch,smap.get(ch)-1);
                if(tmap.containsKey(ch) && smap.get(ch).intValue()<tmap.get(ch).intValue()){
                    formed--;
                }
                l++;
            }
            r++;
        }
        return res[0]!=-1?s.substring(res[1],res[2]+1):"";
    }
}
