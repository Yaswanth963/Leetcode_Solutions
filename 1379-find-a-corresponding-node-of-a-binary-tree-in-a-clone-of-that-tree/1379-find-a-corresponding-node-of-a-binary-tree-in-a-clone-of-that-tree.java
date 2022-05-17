/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return findNode(cloned,target);
    }
    
    TreeNode findNode(TreeNode root, TreeNode tar){
        if(root==null || tar ==null)
            return null;
        if(root.val == tar.val)
            return root;
        TreeNode leftSearch = findNode(root.left,tar);
        TreeNode rightSearch = findNode(root.right,tar);
        return leftSearch!=null?leftSearch:rightSearch;
    }
}