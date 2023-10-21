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
    int xdepth = -1;
    int ydepth = -1;
    TreeNode xparent = null;
    TreeNode yparent = null;
    public boolean isCousins(TreeNode root, int x, int y) {
        helper(root, x, y, 0, null);
        if (xdepth == ydepth && xparent != yparent) {
            return true;
        }
    return false;
    }
    private void helper(TreeNode root, int x, int y, int depth, TreeNode parent) {
        if (root == null) {
            return;
        }
        if (root.val == x) {
            xdepth = depth;
            xparent = parent;
        } 
        else if (root.val == y) {
            ydepth = depth;
            yparent = parent;
        }
        helper(root.left, x, y, depth + 1, root);
        helper(root.right, x, y, depth + 1, root);
    }
}

