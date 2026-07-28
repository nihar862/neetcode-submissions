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
    int best = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        findBest(root);
        return best;
    }

    private int findBest(TreeNode root) {
        if (root == null) return 0;
        int left = findBest(root.left);
        int right = findBest(root.right);
        best = Math.max(best, left+right);
        return 1+Math.max(left, right);
    }
}
