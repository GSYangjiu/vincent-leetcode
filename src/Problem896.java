/**
 * @author Vincent
 * @date 2022/3/11 10:56 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 单调数列
 * URL: https://leetcode-cn.com/problems/monotonic-array/
 * Description：
 */
public class Problem896 {
    static class Solution {
        public boolean isMonotonic(int[] nums) {
            if (nums.length < 3) {
                return true;
            }
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i] - nums[i - 1];
            }
            int tmp = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] * tmp < 0) {
                    return false;
                }
                if (nums[i] != 0) {
                    tmp = nums[i];
                }
            }
            return true;
        }

        //妙 inc和dec最多一个为负
        class Solution1 {
            public boolean isMonotonic(int[] nums) {
                boolean inc = true, dec = true;
                int n = nums.length;
                for (int i = 0; i < n - 1; ++i) {
                    if (nums[i] > nums[i + 1]) {
                        inc = false;
                    }
                    if (nums[i] < nums[i + 1]) {
                        dec = false;
                    }
                }
                return inc || dec;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isMonotonic(new int[]{6, 5, 4, 4}));
    }
}
