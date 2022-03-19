import model.TreeNode;

/**
 * @author Vincent
 * @date 2022/3/19 7:49 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 根据二叉树创建字符串
 * URL: https://leetcode-cn.com/problems/construct-string-from-binary-tree/
 * Description：
 */
public class Problem606 {
    class Solution {
        public String tree2str(TreeNode root) {
            if (root == null) {
                return "";
            }
            if (root.right == null && root.left == null) {
                return String.valueOf(root.val);
            }
            if (root.right == null) {
                return root.val + "(" + tree2str(root.left) + ")";
            }
            return root.val + "(" + tree2str(root.left) + ")" + "(" + tree2str(root.right) + ")";
        }
    }
}
