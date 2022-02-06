import java.util.Arrays;

/**
 * @author Vincent
 * @date 2022/2/6 4:04 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 最接近的三数之和
 * URL: https://leetcode-cn.com/problems/3sum-closest/
 * Description：
 */
public class Problem16 {
    public int threeSumClosest(int[] nums, int target) {
        //避免超过int最大值 转为负数 取绝对值还是负数
        int res = Integer.MAX_VALUE - target;
        if (nums == null || nums.length < 1) {
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[l] + nums[r] + nums[i];
                if (sum == target) {
                    return target;
                } else if (sum < target) {
                    res = Math.abs(res - target) > Math.abs(sum - target) ? sum : res;
                    l++;
                } else {
                    res = Math.abs(res - target) > Math.abs(sum - target) ? sum : res;
                    r--;
                }
            }
        }
        return res;
    }
}
