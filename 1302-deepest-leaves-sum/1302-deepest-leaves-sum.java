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
    int sum=0;
    public int deepestLeavesSum(TreeNode root) {
        int height = getHeight(root);
        getLeafSum(root,height);
        return sum;
    }
    
    void getLeafSum(TreeNode root, int h){
        if(root==null)
            return;
        if(h==1)
            sum+=root.val;
        getLeafSum(root.left,h-1);
        getLeafSum(root.right,h-1);
    }
    
    int getHeight(TreeNode root){
        if(root==null)
            return 0;
        return 1+Math.max(getHeight(root.left),getHeight(root.right));
    }
}


//Optimised
// class Solution {
//     int maxHeight = Integer.MIN_VALUE;
//     int height = 0;
//     int maxSum = 0;
//     public int deepestLeavesSum(TreeNode root) {
//         inorderDFS(root,height);
//         return maxSum;
//     }
//     public void inorderDFS(TreeNode root, int height){
//         if(root == null) return;
//         height += 1;
//         inorderDFS(root.left,height);
//         if(root.left == null && root.right==null){ // Node is leaf
//             if(maxHeight < height){
//                 maxHeight = height;
//                 maxSum = root.val;
//             }
//             else if(maxHeight == height){
//                 maxSum = maxSum + root.val;
//             }
//         }
//         inorderDFS(root.right,height);
//     }
// }