/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        int depth = 1;
        int ldepth = 0;
        int rdepth = 0;
        if(root == null){
            return 0;
        }
        if(root.left==null && root.right==null){
            depth = 1;
        }
        if(root.left!=null){
            ldepth = maxDepth(root.left);
        }
        if(root.right!=null){
            rdepth = maxDepth(root.right);
        }
        return (ldepth>rdepth)?depth+ldepth:depth+rdepth;
    }
}
