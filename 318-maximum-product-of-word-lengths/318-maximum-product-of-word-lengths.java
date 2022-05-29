class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int precal[]= new int[n];
        for(int i=0;i<n;i++){
            String s = words[i];
            for(char ch:s.toCharArray()){
                precal[i] |=1<<(ch-'a');
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((precal[i]&precal[j])==0)
                    max=Math.max(max,words[i].length()*words[j].length());
            }
        }
        return max;
    }
}