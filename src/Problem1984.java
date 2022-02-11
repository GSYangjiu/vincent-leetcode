import java.util.Arrays;

/**
 * @author Vincent
 * @date 2022/2/11 11:23 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 学生分数的最小差值
 * URL: https://leetcode-cn.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
 * Description：
 */
public class Problem1984 {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) {
            return 0;
        }
        Arrays.sort(nums);
        int res = nums[nums.length - 1] - nums[0];
        int l = 0, r = k - 1;
        while (r < nums.length) {
            res = Math.min(res, nums[r] - nums[l]);
            l++;
            r = l + k - 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Problem1984 problem1984 = new Problem1984();
        int[] nums = new int[]{9, 4, 1, 7};
        System.out.println(problem1984.minimumDifference(nums, 2));
    }
}
