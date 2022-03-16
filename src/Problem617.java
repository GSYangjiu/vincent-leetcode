import model.TreeNode;

/**
 * @author Vincent
 * @date 2022/3/16 11:22 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 合并二叉树
 * URL: https://leetcode-cn.com/problems/merge-two-binary-trees/
 * Description：
 */
public class Problem617 {
    class Solution {
        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            if (t1 == null) {
                return t2;
            }
            if (t2 == null) {
                return t1;
            }
            TreeNode merged = new TreeNode(t1.val + t2.val);
            merged.left = mergeTrees(t1.left, t2.left);
            merged.right = mergeTrees(t1.right, t2.right);
            return merged;
        }
    }
}
