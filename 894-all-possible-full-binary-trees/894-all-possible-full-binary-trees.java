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
    Map<Integer,List<TreeNode>> memo = new HashMap<>();
    public List<TreeNode> allPossibleFBT(int n) {
        if(n==1){
            List<TreeNode> one = new ArrayList<>();
            one.add(new TreeNode(0));
            return one;
        }
        if(memo.containsKey(n))
            return memo.get(n);
        List<TreeNode> left,right;
        List<TreeNode> temp=new ArrayList<>();
        for(int i=1;i<n;i+=2){
            left = allPossibleFBT(i);
            right = allPossibleFBT(n-i-1);
            for(TreeNode l:left){
                for(TreeNode r:right){
                    TreeNode root = new TreeNode(0,l,r);
                    temp.add(root);
                }
            }
        }
        memo.put(n,temp);
        return temp;
    }
}