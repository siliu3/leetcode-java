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
    public boolean isSymmetric(TreeNode root) {
        if(root==null || (root.left==null && root.right==null))
            return true;
        else if((root.left==null && root.right!=null) || (root.left!=null && root.right==null))
            return false;
        else if(root.left.val != root.right.val)
            return false;
        else{
            TreeNode nroot = new TreeNode(0);
            nroot.left = root.left.left;
            nroot.right = root.right.right;
            TreeNode mroot = new TreeNode(0);
            mroot.left = root.left.right;
            mroot.right = root.right.left;
            return isSymmetric(nroot) && isSymmetric(mroot);
            
        }
    }
}
