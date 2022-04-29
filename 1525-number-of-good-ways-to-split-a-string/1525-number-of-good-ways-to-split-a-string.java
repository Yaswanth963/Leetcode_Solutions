class Solution {
    public int numSplits(String s) {
        int len = s.length();
        int prefix[] = new int[len];
        int sufix[]= new int[len];
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
            prefix[i]=set.size();
        }
        set.clear();
        for(int i=len-1;i>=0;i--){
            set.add(s.charAt(i));
            sufix[i]=set.size();
        }
        int c=0;
        for(int i=0;i<len-1;i++)
            if(prefix[i]==sufix[i+1])
                c++;
        return c;
    }
}