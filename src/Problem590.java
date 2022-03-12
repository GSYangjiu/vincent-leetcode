import model.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/3/12 10:44 上午
 * Email: vincent1094259423@yahoo.com
 * Title: N叉树的后序遍历
 * URL: https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
 * Description：
 */
public class Problem590 {
    class Solution {
        public List<Integer> postorder(Node root) {
            List<Integer> res = new ArrayList<>();
            postorder(root, res);
            return res;
        }

        public void postorder(Node node, List<Integer> res) {
            if (node != null) {
                for (int i = 0; i < node.children.size(); i++) {
                    postorder(node.children.get(i), res);
                }
                res.add(node.val);
            }
        }
    }
}
