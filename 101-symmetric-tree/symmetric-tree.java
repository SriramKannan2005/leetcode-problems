class Solution {
    ArrayList<Integer> p1 = new ArrayList<>();
    ArrayList<Integer> q1 = new ArrayList<>();

    public void preorder1(TreeNode root) {
        if (root == null) {
            p1.add(null);
            return;
        }

        p1.add(root.val);
        preorder1(root.left);
        preorder1(root.right);
    }

    // 🔥 CHANGE HERE: mirror traversal
    public void preorder2(TreeNode root) {
        if (root == null) {
            q1.add(null);
            return;
        }

        q1.add(root.val);
        preorder2(root.right);   // swapped
        preorder2(root.left);    // swapped
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        // ⚠️ clear lists (important for multiple test cases)
        p1.clear();
        q1.clear();

        preorder1(root.left);
        preorder2(root.right);

        if (p1.size() != q1.size()) return false;

        for (int i = 0; i < p1.size(); i++) {
            if (!Objects.equals(p1.get(i), q1.get(i))) {
                return false;
            }
        }
        return true;
    }
}