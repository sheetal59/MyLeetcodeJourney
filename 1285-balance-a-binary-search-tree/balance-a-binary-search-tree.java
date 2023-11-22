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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        if(root==null){
            return null;
        }
        getInorder(root, inorder);
       TreeNode root1 = createBST(inorder,0,inorder.size()-1);
        return root1;
    }
    public void getInorder(TreeNode root, ArrayList<Integer> inorder){
        if(root==null){
            return;
        }
        getInorder(root.left,inorder);
        inorder.add(root.val);
        getInorder(root.right, inorder);
    }
    public static TreeNode createBST(ArrayList<Integer> inorder, int start, int end){
        int mid = (start+end)/2;
        if(start>end){
            return null;
        }
        TreeNode root = new TreeNode(inorder.get(mid));
        root.left = createBST(inorder,start,mid-1);
        root.right = createBST(inorder,mid+1,end);
        return root;
    }
}