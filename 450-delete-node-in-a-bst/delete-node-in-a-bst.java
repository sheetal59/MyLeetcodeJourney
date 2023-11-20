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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(root.val>key){
            root.left = deleteNode(root.left,key);
            return root;
        }
        else if(root.val<key){
            root.right = deleteNode(root.right,key);
            return root;
        }
        else{
            //case1--no child
            if(root.left==null && root.right==null){
                return null;
            }
            //case2--single child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            TreeNode is = findInorderSuccessor(root.right);
            root.val = is.val;
            root.right = deleteNode(root.right, is.val);
        }
        return root;
    }
    public TreeNode findInorderSuccessor(TreeNode root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }
}