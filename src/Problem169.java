import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Vincent
 * @date 2022/3/11 2:24 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 多数元素
 * URL: https://leetcode-cn.com/problems/majority-element/
 * Description：
 */
public class Problem169 {
    class Solution {
        public int majorityElement(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int count = map.getOrDefault(nums[i], 0) + 1;
                if (count > nums.length / 2) {
                    return nums[i];
                } else {
                    map.put(nums[i], count);
                }
            }
            return 0;
        }
    }

    //妙
    class Solution1 {
        public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length / 2];
        }
    }
}
