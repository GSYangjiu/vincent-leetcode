import java.util.HashMap;
import java.util.Map;

/**
 * @author Vincent
 * @date 2022/2/25 10:47 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 存在重复元素
 * URL: https://leetcode-cn.com/problems/contains-duplicate/
 * Description：
 */
public class Problem217 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
