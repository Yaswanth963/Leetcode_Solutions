class Solution {
    public boolean validPalindrome(String s) {
       int l=0,r=s.length()-1;
        while(l<r && s.charAt(l)==s.charAt(r)){
            l++;
            r--;
        }
        return palindrome(l+1,r,s) || palindrome(l,r-1,s);
    }
    
    boolean palindrome(int i, int j, String s){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}