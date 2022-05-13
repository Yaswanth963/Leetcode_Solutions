/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)
            return null;
        Node node = root;
        List<Node> al =new ArrayList<>();
        int height = height(node);
        int dp[] = new int[height];
        for(int i=1;i<height;i++)
            dp[i]=dp[i-1]+(int)Math.pow(2,i);
        for(int i=1;i<=height;i++)
            fun(node,al,i);
        int j=0;
        for(int i=0;i<height;i++){
            for(j=(int)Math.pow(2,i)-1;j<dp[i];j++){
                al.get(j).next=al.get(j+1);
            }
        }
        return root;
    }
    
    void fun(Node root,List<Node> al, int level){
        if(root==null)
            return;
        if(level==1)
            al.add(root);
        else{
            fun(root.left,al,level-1);
            fun(root.right,al,level-1);
        }
    }
    
    int height(Node root){
        if(root==null)
            return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
   
}