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
    List<List<Integer>> result=new ArrayList<>();
    boolean flag=false;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<Integer>temp;
      if (root == null) {
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
             temp=new ArrayList<>();
             int size=q.size();
             for(int i=0;i<size;i++){
            TreeNode cur = q.poll();
           temp.add(cur.val);
            if (cur.left != null) {
                q.offer(cur.left);
            }
            if (cur.right != null) {
                q.offer(cur.right);
            }}
            if(flag==false){
             result.add((temp));
             flag=true;
            }
            else if(flag==true)
            {
                 result.add(temp.reversed());
             flag=false;
            }
        
    }
    return result;
}
}