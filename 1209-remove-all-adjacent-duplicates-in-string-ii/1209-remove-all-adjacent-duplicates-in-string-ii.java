class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair>st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(st.isEmpty() || st.peek().ch!=ch)
                st.push(new Pair(ch,1));
            else{
                Pair p=st.peek();
                if(p.in<k-1){
                    st.pop();
                    st.push(new Pair(p.ch,p.in+1));
                }
                else
                    st.pop();
            }
        }
        String str="";
        while(!st.isEmpty()){
            Pair p = st.pop();
            str=(p.ch+"").repeat(p.in)+str;
        }
        return str;
    }
}

class Pair{
    char ch;
    int in;
    Pair(char ch, int in){
        this.ch=ch;
        this.in=in;
    }
}