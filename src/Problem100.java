import model.TreeNode;

/**
 * @author Vincent
 * @date 2022/3/19 8:30 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 相同的树
 * URL: https://leetcode-cn.com/problems/same-tree/
 * Description：
 */
public class Problem100 {
    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null) {
                return true;
            }
            if (p == null || q == null || p.val != q.val) {
                return false;
            }
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}
