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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftDepth = minDepth(root.left) +1;
        int rightDepth = minDepth(root.right) +1;
        //case to handle right and left skewed
        if(root.left==null){
            return rightDepth;
        }
        if(root.right==null){
            return leftDepth;
        }
        int miniDepth = Math.min(leftDepth, rightDepth);
        return miniDepth;
    }
}