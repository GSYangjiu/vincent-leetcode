/**
 * @author Vincent
 * @date 2022/3/16 11:05 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 递增的三元子序列
 * URL: https://leetcode-cn.com/problems/increasing-triplet-subsequence/
 * Description：
 */
public class Problem334 {
    class Solution {
        public boolean increasingTriplet(int[] nums) {
            int n = nums.length;
            if (n < 3) {
                return false;
            }
            int first = nums[0], second = Integer.MAX_VALUE;
            for (int i = 1; i < n; i++) {
                int num = nums[i];
                if (num > second) {
                    return true;
                } else if (num > first) {
                    second = num;
                } else {
                    first = num;
                }
            }
            return false;
        }
    }
}
