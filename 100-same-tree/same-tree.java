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
    ArrayList<Integer> q1=new ArrayList<>();
    ArrayList<Integer> p1=new ArrayList<>();
    public void preorder1(TreeNode root)
{
    if (root == null) {
        p1.add(null);
        return;
    }

    p1.add(root.val);          // 👈 root first
    preorder1(root.left);
    preorder1(root.right);
}

public void preorder2(TreeNode root)
{
    if (root == null) {
        q1.add(null);
        return;
    }

    q1.add(root.val);          // 👈 root first
    preorder2(root.left);
    preorder2(root.right);
}
    public boolean isSameTree(TreeNode p, TreeNode q) {
    preorder1(p);
    preorder2(q);

    if(p1.size() != q1.size()) return false;

    for(int i = 0; i < p1.size(); i++)
    {
        if(!Objects.equals(p1.get(i), q1.get(i)))
        {
            return false;
        }
    }
    return true;
}
}