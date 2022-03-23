import model.TreeNode;

/**
 * @author Vincent
 * @date 2022/3/23 11:06 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 将有序数组转换为二叉搜索树
 * URL: https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
 * Description：
 */
public class Problem108 {
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            return helper(nums, 0, nums.length - 1);
        }

        public TreeNode helper(int[] nums, int left, int right) {
            if (left > right) {
                return null;
            }

            // 总是选择中间位置左边的数字作为根节点
            int mid = (left + right) / 2;

            TreeNode root = new TreeNode(nums[mid]);
            root.left = helper(nums, left, mid - 1);
            root.right = helper(nums, mid + 1, right);
            return root;
        }
    }
}
