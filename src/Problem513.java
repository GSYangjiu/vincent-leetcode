import model.TreeNode;

/**
 * @author Vincent
 * @date 2022/6/22 4:56 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 找树左下角的值
 * URL: https://leetcode.cn/problems/find-bottom-left-tree-value/
 * Description：
 */
public class Problem513 {
    class Solution {
        int curVal = 0;
        int curHeight = 0;

        public int findBottomLeftValue(TreeNode root) {
            int curHeight = 0;
            dfs(root, 0);
            return curVal;
        }

        private void dfs(TreeNode root, int height) {
            if (root == null) {
                return;
            }
            height++;
            dfs(root.left, height);
            dfs(root.right, height);
            if (height > curHeight) {
                curHeight = height;
                curVal = root.val;
            }
        }
    }
}
