/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int diam =0;
    public int diameterOfBinaryTree(TreeNode root) {
           if(root==null)
               return 0;
        diameter(root);
        return diam-1;
    }
    
    int diameter(TreeNode root){
        if(root==null)
            return 0;
        int left = diameter(root.left);
        int right = diameter(root.right);
        int max = left+right+1;
        if(max>diam)
            diam = max;
        return 1+Math.max(left,right);
    }
}