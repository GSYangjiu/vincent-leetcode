import java.util.Arrays;

/**
 * @author Vincent
 * @date 2022/3/15 2:59 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 缺失的第一个正数
 * URL: https://leetcode-cn.com/problems/first-missing-positive/
 * Description：
 */
public class Problem41 {
    class Solution {
        public int firstMissingPositive(int[] nums) {
            Arrays.sort(nums);
            int res = 1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    if (nums[i] > res) {
                        return res;
                    } else {
                        res = nums[i] + 1;
                    }
                }
            }
            return res;
        }
    }
}
