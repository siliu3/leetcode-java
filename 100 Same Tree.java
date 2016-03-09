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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null||q==null){
            return p==null&&q==null;
        }else if(p.val!=q.val){
            return false;
        }else if(!isSameTree(p.left,q.left)||!isSameTree(p.right,q.right)){
            return false;
        }else{
            return true;
        }
    }
}
