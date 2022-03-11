import java.util.HashSet;
import java.util.Set;

/**
 * @author Vincent
 * @date 2022/3/11 11:20 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 只出现一次的数字
 * URL: https://leetcode-cn.com/problems/single-number/
 * Description：
 */
public class Problem136 {
    class Solution {
        Set<Integer> set = new HashSet<>();
        public int singleNumber(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (!set.add(nums[i])){
                    set.remove(nums[i]);
                }
            }
            return set.iterator().next();
        }
    }

    //位运算
    class Solution1 {
        public int singleNumber(int[] nums) {
            int single = 0;
            for (int num : nums) {
                single ^= num;
            }
            return single;
        }
    }
}
