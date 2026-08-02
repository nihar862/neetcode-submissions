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
        dfs(root);
        return best;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int L = dfs(root.left);
        int R = dfs(root.right);

        best = Math.max(best, L+R);

        return 1+Math.max(L,R);
    }
}
