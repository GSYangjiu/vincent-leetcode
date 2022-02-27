import java.util.Arrays;

/**
 * @author Vincent
 * @date 2022/2/27 9:20 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 三角形的最大周长
 * URL: https://leetcode-cn.com/problems/largest-perimeter-triangle/
 * Description：贪心算法
 */
public class Problem976 {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i > 1; i--) {
            int j = i - 1;
            int k = i - 2;
            if (nums[j] + nums[k] > nums[i]) {
                return nums[i] + nums[j] + nums[k];
            }
        }
        return 0;
    }
}
