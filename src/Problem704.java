/**
 * @author Vincent
 * @date 2022/3/8 5:40 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 二分查找
 * URL: https://leetcode-cn.com/problems/binary-search/
 * Description：
 */
public class Problem704 {
    class Solution {
        public int search(int[] nums, int target) {
            return binarySearch(nums, 0, nums.length - 1, target);
        }

        private int binarySearch(int[] nums, int l, int r, int target) {
            if (l <= r) {
                int mid = l + (r - l) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    return binarySearch(nums, l, mid - 1, target);
                } else {
                    return binarySearch(nums, mid + 1, r, target);
                }
            } else {
                return -1;
            }
        }
    }
}
