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
        Node node=root;
        while(node!=null){
            //creating dummy node
            Node dummy = new Node(0);
            //reference of dummy
            Node temp = dummy;
            while(node!=null){
                if(node.left!=null){
                    temp.next= node.left;
                    temp=temp.next;
                }
                if(node.right!=null){
                    temp.next=node.right;
                    temp=temp.next;
                }
                //covering left and right and moving next in current level
                node=node.next;
            }
            //assign dummy.next to node since dummy points at starting of prev level
            node=dummy.next;
        }
        return root;
    }
}



// class Solution {
//     public Node connect(Node root) {
//         if(root==null)
//             return root;
//         Queue<Node> q = new LinkedList<>();
//         Node rot = root;
//         q.add(rot);
//         while(!q.isEmpty()){
//             int size = q.size();
//             Node prev =null;
//             while(size-->0){
//                 Node pop = q.poll();
//                 if(prev!=null)
//                     pop.next=prev;
//                 prev=pop;
                
//                 if(prev.right!=null)
//                     q.add(prev.right);
//                 if(prev.left!=null)
//                     q.add(prev.left);
//             }
//         }
//         return root;
//     }
// }