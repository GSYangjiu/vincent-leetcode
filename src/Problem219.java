import java.util.HashMap;
import java.util.Map;

/**
 * @author Vincent
 * @date 2022/6/28 2:05 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 存在重复元素II
 * URL: https://leetcode.cn/problems/contains-duplicate-ii/
 * Description：
 */
public class Problem219 {
    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    if (k >= Math.abs(map.get(nums[i]) - i)) {
                        return true;
                    }
                }
                map.put(nums[i], i);
            }
            return false;
        }
    }
}
