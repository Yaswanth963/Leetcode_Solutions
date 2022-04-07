class Solution {
    public String getHint(String secret, String guess) {
        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> map2= new HashMap<>();
        int c=0;
        for(int i=0;i<secret.length();i++)
            if(secret.charAt(i)==guess.charAt(i))
                c++;
            else{
               map.put(guess.charAt(i),map.getOrDefault(guess.charAt(i),0)+1); 
                map2.put(secret.charAt(i),map2.getOrDefault(secret.charAt(i),0)+1); 
            }
        int cn=0;
        for(Character ch:map.keySet())
            if(secret.contains(ch+""))
                cn+=Math.min(map.getOrDefault(ch,0),map2.getOrDefault(ch,0));
        return c+"A"+cn+"B";
    }
}