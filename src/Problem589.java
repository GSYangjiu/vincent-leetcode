import model.Node;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/3/1 4:06 下午
 * Email: vincent1094259423@yahoo.com
 * Title: N叉树的前序遍历
 * URL: https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/submissions/
 * Description：
 */
public class Problem589 {

    LinkedList<Integer> res = new LinkedList<>();

    public List<Integer> preorder(Node root) {
        if (root == null) {
            return res;
        }

        res.add(root.val);
        for (Node child : root.children) {
            preorder(child);
        }
        return res;
    }

    /**
     * 迭代实现
     */
    public List<Integer> preorderEx(Node root) {
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }

        LinkedList<Node> stack = new LinkedList<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            output.add(node.val);
            Collections.reverse(node.children);
            for (Node item : node.children) {
                stack.add(item);
            }
        }
        return output;
    }
}
