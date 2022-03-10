import model.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Vincent
 * @date 2022/3/10 5:43 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 验证二叉搜索树
 * URL: https://leetcode-cn.com/problems/validate-binary-search-tree/
 * Description：
 */
public class Problem98 {
    class Solution {
        public boolean isValidBST(TreeNode root) {
            return check(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        public boolean check(TreeNode root, long leftMax, long rightMin) {
            if (root == null) {
                return true;
            }

            if (root.val <= leftMax || root.val >= rightMin) {
                return false;
            }
            return check(root.left, leftMax, root.val) && check(root.right, root.val, rightMin);
        }
    }

    //中序遍历一定升序
    class Solution1 {
        public boolean isValidBST(TreeNode root) {
            Deque<TreeNode> stack = new LinkedList<TreeNode>();
            double inorder = -Double.MAX_VALUE;

            while (!stack.isEmpty() || root != null) {
                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }
                root = stack.pop();
                // 如果中序遍历得到的节点的值小于等于前一个 inorder，说明不是二叉搜索树
                if (root.val <= inorder) {
                    return false;
                }
                inorder = root.val;
                root = root.right;
            }
            return true;
        }
    }
}
