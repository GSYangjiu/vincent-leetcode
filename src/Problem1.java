import java.util.HashMap;
import java.util.Map;

/**
 * @author Vincent
 * @date 2022/1/27 11:26 下午
 * Email: vincent1094259423@yahoo.com
 * Description：https://leetcode-cn.com/problems/two-sum/
 */
public class Problem1 {

    public int[] twoSum(int[] numbers, int target) {
        int[] sort = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                sort[1] = i;
                sort[0] = map.get(target - numbers[i]);
                return sort;
            }
            map.put(numbers[i], i);
        }
        return sort;
    }
}
