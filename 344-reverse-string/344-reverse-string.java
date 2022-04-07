class Solution {
    public void reverseString(char[] s) {
        int len=s.length,mid = len/2,i=0;
        while(i<mid){
            char ch = s[i];
            s[i]=s[len-i-1];
            s[len-i-1]=ch;
            i++;
        }
    }
}