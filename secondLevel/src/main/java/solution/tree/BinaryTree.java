
package solution.tree;

public class BinaryTree {
    TreeNode head;

    public int maxDepth(TreeNode head) {
        if (head == null) return 0;
        int Left = maxDepth(head.getLeft());
        int Right = maxDepth(head.getRight());
        return Math.max(Left,Right) + 1;
    }
}