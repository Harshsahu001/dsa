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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q= new ArrayDeque<TreeNode>();
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        if(root ==null)
        {
            return arr;
        }
        q.add(root);
        while(!q.isEmpty())
        { 
          int n=q.size();
          List<Integer> l = new ArrayList<Integer>();
          for(int i=0;i<n;i++)
        {
            if(q.peek().left!=null)
           {
               q.add(q.peek().left);
            }
           if(q.peek().right!=null)
           {
               q.add(q.peek().right);
            }
            l.add(q.poll().val);
        }
        arr.add(l);
        }
        Collections.reverse(arr);
        return arr;
    }
}