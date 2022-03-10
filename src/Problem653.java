import model.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Vincent
 * @date 2022/3/10 2:11 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 两数之和IV-输入BST
 * URL: https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst/
 * Description：
 */
public class Problem653 {
    class Solution {
        Map<Integer, Integer> map = new HashMap<>();

        public boolean findTarget(TreeNode root, int k) {
            return search(root, k);
        }

        private boolean search(TreeNode node, int k) {
            if (node != null) {
                int temp = k - node.val;
                if (map.containsKey(temp)) {
                    return true;
                } else {
                    map.put(node.val, 0);
                    return search(node.left, k) || search(node.right, k);
                }
            }
            return false;
        }
    }
}
