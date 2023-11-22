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
    public TreeNode sortedArrayToBST(int[] nums) {
        return convertToBST(nums,0, nums.length-1);
    }
    public TreeNode convertToBST(int nums[], int start, int end){
        int mid = (start+end)/2;
        if(start>end){
            return null;
        }
        TreeNode root = new TreeNode(nums[mid]);
        root.left = convertToBST(nums, start, mid-1);
        root.right = convertToBST(nums,mid+1, end);
        return root;
    }
}