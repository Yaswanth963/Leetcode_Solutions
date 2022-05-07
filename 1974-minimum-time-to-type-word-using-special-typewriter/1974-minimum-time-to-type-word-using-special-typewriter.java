class Solution {
    public int minTimeToType(String word) {
        int pos=1,ans=0;
        for(char ch:word.toCharArray()){
            ans++;
            int curr = (ch-'a')+1;
            ans+=Math.min(Math.abs(curr-pos),26-Math.abs(curr-pos));
            pos=curr;
        }
        return ans;
    }
}