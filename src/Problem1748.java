import java.util.HashMap;
import java.util.Map;

/**
 * @author Vincent
 * @date 2022/2/6 10:23 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 唯一元素的和
 * URL: https://leetcode-cn.com/problems/sum-of-unique-elements/
 * Description：
 */
public class Problem1748 {
    public int sumOfUnique(int[] nums) {
        int res = 0;
        if (nums == null || nums.length < 1) {
            return res;
        }
        Map<Integer, Boolean> cache = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!cache.containsKey(nums[i])) {
                res += nums[i];
                cache.put(nums[i], true);
            } else if (cache.get(nums[i])) {
                //第二次碰到重复元素i 从累和中减去i 标识置为false 后续碰到元素i不进行处理
                res -= nums[i];
                cache.put(nums[i], false);
            }
        }
        return res;
    }
}
