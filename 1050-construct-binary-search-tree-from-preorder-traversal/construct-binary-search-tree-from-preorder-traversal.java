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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root= new TreeNode(preorder[0]);
        for(int data:preorder){
            insert(root, data);
        }
        return root;
    }
    public TreeNode insert(TreeNode root, int data){
        if(root==null){
            root = new TreeNode(data);
            return root;
        }
        //left subtree
        if(root.val> data){
            root.left = insert(root.left,data);
        }
        //right subtree
        if(root.val<data){
            root.right = insert(root.right, data);
        }
        return root;
    }
}