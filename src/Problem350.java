import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Vincent
 * @date 2022/2/27 9:03 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 两个数组的交集 II
 * URL: https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
 * Description：
 */
public class Problem350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : nums1) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        for (int j : nums2) {
            if (map.getOrDefault(j, 0) != 0) {
                list.add(j);
                map.put(j, map.get(j) - 1);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
