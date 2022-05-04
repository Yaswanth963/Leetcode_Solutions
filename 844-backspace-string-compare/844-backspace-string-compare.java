class Solution {
    public boolean backspaceCompare(String s, String t) {
        return check(s).equals(check(t));
    }
    
    String check(String s){
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch!='#')
                st.push(ch);
            else if(!st.isEmpty()) st.pop();
        }
        return String.valueOf(st);
    }
}