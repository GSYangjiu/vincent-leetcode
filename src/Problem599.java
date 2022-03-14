import java.util.*;

/**
 * @author Vincent
 * @date 2022/3/14 9:44 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 两个列表的最小索引总和
 * URL: https://leetcode-cn.com/problems/minimum-index-sum-of-two-lists/
 * Description：
 */
public class Problem599 {
    static class Solution {
        public String[] findRestaurant(String[] list1, String[] list2) {
            int min = Integer.MAX_VALUE;
            List<String> res = new ArrayList<>();
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < list1.length; i++) {
                map.put(list1[i], i);
            }
            for (int i = 0; i < list2.length; i++) {
                if (i > min) {
                    break;
                }
                if (map.containsKey(list2[i])) {
                    int indexSum = map.get(list2[i]) + i;
                    if (indexSum < min) {
                        res.clear();
                        res.add(list2[i]);
                        min = indexSum;
                    } else if (indexSum == min) {
                        res.add(list2[i]);
                    }
                }
            }
            return res.toArray(new String[0]);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"}, new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"})));
    }
}
