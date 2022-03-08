import model.TreeNode;

/**
 * @author Vincent
 * @date 2022/3/8 2:18 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 路径总和
 * URL: https://leetcode-cn.com/problems/path-sum/
 * Description：
 */
public class Problem112 {
    class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            return check(root, 0, targetSum);
        }

        private boolean check(TreeNode cur, int sum, int targetSum) {
            if (cur == null) {
                return false;
            }
            sum += cur.val;
            if (cur.left == null && cur.right == null) {
                return sum == targetSum;
            } else {
                return check(cur.left, sum, targetSum) || check(cur.right, sum, targetSum);
            }
        }
    }
}
