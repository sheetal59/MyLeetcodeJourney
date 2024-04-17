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
    boolean bal = true;
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        heightBal(root);
        return bal;

    }
    private int heightBal(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = heightBal(root.left);
        int right = heightBal(root.right);

        int max = Math.max(left,right)+1;

        if(Math.abs(left-right)>1){
            bal = false;
        }
        return max;
    }
}