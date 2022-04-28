class Solution {
    public int countSubstrings(String s, String t) {
        int slen = s.length(), tlen=t.length();
        int gsum=0,tempsum=0;
        for(int i=0;i<slen;i++){
            for(int j=0;j<tlen;j++){
                tempsum=0;
                int x=i,y=j;
                while(x<slen && y<tlen){
                    if(s.charAt(x)!=t.charAt(y))
                        tempsum++;
                        if(tempsum==1)
                            gsum++;
                        if(tempsum>1)
                            break;
                    x++;
                    y++;
                }
            }
        }
        return gsum;
    }
}