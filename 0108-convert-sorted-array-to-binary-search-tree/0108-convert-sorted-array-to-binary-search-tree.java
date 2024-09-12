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
        
        return makeTreeBST(nums, 0, nums.length-1);
        
    }
    
    public TreeNode makeTreeBST(int[] nums, int start, int end){
        
        if(start > end){
            return null;
        }
        
        int midIndex = (start + end) / 2;
        
        TreeNode root = new TreeNode(nums[midIndex]);
        
        root.left = makeTreeBST(nums, start, midIndex-1);
        root.right = makeTreeBST(nums, midIndex+1, end);
        
        return root;
        
    }
}