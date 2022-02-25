/**
 * @author Vincent
 * @date 2022/2/25 10:55 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 最大子数组和
 * URL: https://leetcode-cn.com/problems/maximum-subarray/
 * Description：
 */
public class Problem53 {
    public static int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}
