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
    int max =Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
         fun(root);
        return max;
    }
    int fun(TreeNode root){
        if(root ==null)
            return 0;
        int left = fun(root.left);
        int right = fun(root.right);
        int max1=Math.max(Math.max(left,right)+root.val,root.val);
        int max2 = Math.max(max1,left+right+root.val);
        max=Math.max(max,max2);
        return max1;
    }
}