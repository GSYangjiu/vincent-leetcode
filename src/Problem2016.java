/**
 * @author Vincent
 * @date 2022/2/26 11:42 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 增量元素之间的最大差值
 * URL: https://leetcode-cn.com/problems/maximum-difference-between-increasing-elements/
 * Description：
 */
public class Problem2016 {
    public int maximumDifference(int[] nums) {
        int max = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[j - 1]) {
                    continue;
                }
                if (nums[j] - nums[i] > 0) {
                    max = Math.max(max, nums[j] - nums[i]);
                }
            }
        }
        return max;
    }

    /**
     * 最小前缀preMin
     * num[i]大于preMin,计算最大值
     * num[i]小于preMin,重置preMin
     */
    public int maximumDifferenceEx(int[] nums) {
        int n = nums.length;
        int ans = -1, premin = nums[0];
        for (int i = 1; i < n; ++i) {
            if (nums[i] > premin) {
                ans = Math.max(ans, nums[i] - premin);
            } else {
                premin = nums[i];
            }
        }
        return ans;
    }
}
