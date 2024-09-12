//시간복잡도 : O(N), N은 배열의 길이
//자료구조 : Tree
//아이디어 : 배열을 중간값을 기준으로 두 개로 나누고, 각 부분 마다 재귀호출로 다시 트리를 만든다. 배열이 이미 정렬되어 있으므로, 매번 정렬을 하지 않아도 된다.

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