class Solution {
    public int removePalindromeSub(String s) {
        if(s.length()==0)
            return 0;
        if(isPalindrome(s))
            return 1;
        return 2;
    }
    
    boolean isPalindrome(String s){
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}