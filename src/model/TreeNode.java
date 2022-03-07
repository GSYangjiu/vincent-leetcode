package model;

/**
 * @author Vincent
 * @date 2022/3/7 12:30 下午
 * Email: vincent1094259423@yahoo.com
 * Title:
 * URL:
 * Description：
 */

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
