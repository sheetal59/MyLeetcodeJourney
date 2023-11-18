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
    int diam=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diam;
    }
     private int height(TreeNode root){
         if(root==null){
             return 0;
         }
       int leftHeight = height(root.left);
       int rightHeight = height(root.right);
       if((leftHeight + rightHeight)>diam){
           diam = leftHeight + rightHeight;
       }
       int treeHeight = Math.max(leftHeight, rightHeight) +1;
       return treeHeight;
   }
}