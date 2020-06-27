package solution.tree;

public class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;

    TreeNode(int x) { val = x; }

    public int getVal() {
        return val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
