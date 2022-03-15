/**
 * @author Vincent
 * @date 2022/3/15 10:46 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 统计按位或能得到最大值的子集数目
 * URL: https://leetcode-cn.com/problems/count-number-of-maximum-bitwise-or-subsets/
 * Description：
 */
public class Problem2044 {
    static class Solution {
        public int countMaxOrSubsets(int[] nums) {
            int maxOr = 0, cnt = 0;
            for (int i = 0; i < 1 << nums.length; i++) {
                int orVal = 0;
                for (int j = 0; j < nums.length; j++) {
                    if (((i >> j) & 1) == 1) {
                        orVal |= nums[j];
                    }
                }
                if (orVal > maxOr) {
                    maxOr = orVal;
                    cnt = 1;
                } else if (orVal == maxOr) {
                    cnt++;
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countMaxOrSubsets(new int[]{3, 2, 1, 5}));
    }
}
