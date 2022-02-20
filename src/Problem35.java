/**
 * @author Vincent
 * @date 2022/2/19 12:38 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 搜索插入位置
 * URL: https://leetcode-cn.com/problems/search-insert-position/
 * Description：
 */
public class Problem35 {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
