import model.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Vincent
 * @date 2022/6/24 5:13 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 在每个树行中找最大值
 * URL: https://leetcode.cn/problems/find-largest-value-in-each-tree-row/
 * Description：
 */
public class Problem515 {
    class Solution {
        Map<Integer, Integer> map = new HashMap<>();

        public List<Integer> largestValues(TreeNode root) {
            add(0, root);
            List<Integer> res = new ArrayList<>();
            for (Integer key : map.keySet()) {
                res.add(map.get(key));
            }
            return res;
        }

        private void add(int high, TreeNode node) {
            if (node == null) {
                return;
            }
            if (node.val >= map.getOrDefault(high, Integer.MIN_VALUE)) {
                map.put(high, node.val);
            }
            add(high + 1, node.left);
            add(high + 1, node.right);
        }
    }
}
