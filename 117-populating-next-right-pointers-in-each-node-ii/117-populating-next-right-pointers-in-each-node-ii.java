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
            return root;
        Queue<Node> q = new LinkedList<>();
        Node rot = root;
        q.add(rot);
        while(!q.isEmpty()){
            int size = q.size();
            Node prev =null;
            while(size-->0){
                Node pop = q.poll();
                if(prev!=null)
                    pop.next=prev;
                prev=pop;
                
                if(prev.right!=null)
                    q.add(prev.right);
                if(prev.left!=null)
                    q.add(prev.left);
            }
        }
        return root;
    }
}