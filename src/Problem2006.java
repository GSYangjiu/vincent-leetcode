import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Vincent
 * @date 2022/2/9 12:25 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 差的绝对值为K的数对数目
 * URL: https://leetcode-cn.com/problems/count-number-of-pairs-with-absolute-difference-k/
 * Description：
 */
public class Problem2006 {
    public int countKDifference(int[] nums, int k) {
        int res = 0;
        if (nums.length < 2) {
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    res++;
                }
            }
        }
        return res;
    }

    public int countKDifferenceEx(int[] nums, int k) {
        int res = 0;
        if (nums.length < 2) {
            return res;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            res += map.getOrDefault(nums[i] + k, 0);
            res += map.getOrDefault(nums[i] - k, 0);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return res;
    }
}
