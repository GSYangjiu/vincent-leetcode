import model.TreeNode;

/**
 * @author Vincent
 * @date 2022/3/10 2:34 下午
 * Email: vincent1094259423@yahoo.com
 * Title:  二叉搜索树的最近公共祖先
 * URL: https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * Description：
 */
public class Problem235 {
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            TreeNode ancestor = root;
            while (true) {
                if (p.val < ancestor.val && q.val < ancestor.val) {
                    ancestor = ancestor.left;
                } else if (p.val > ancestor.val && q.val > ancestor.val) {
                    ancestor = ancestor.right;
                } else {
                    break;
                }
            }
            return ancestor;
        }
    }
}
