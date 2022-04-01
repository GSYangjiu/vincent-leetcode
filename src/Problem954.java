import java.util.*;

/**
 * @author Vincent
 * @date 2022/4/1 12:05 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 二倍数对数组
 * URL: https://leetcode-cn.com/problems/array-of-doubled-pairs/
 * Description：
 */
public class Problem954 {
    class Solution {
        public boolean canReorderDoubled(int[] arr) {
            List<Integer> list = new ArrayList<>();
            int count = 0;
            for (int j : arr) {
                list.add(j);
                if (j % 2 == 0) {
                    count++;
                }
            }
            if (count * 2 < arr.length) {
                return false;
            }
            Collections.sort(list);
            boolean[] used = new boolean[arr.length];
            for (int i = 0; i < list.size(); i++) {
                if (used[i]){
                    continue;
                }
                int cur = list.get(i);
                boolean flag = false;
                if (cur < 0) {
                    for (int j = i; j < list.size(); j++) {
                        if (2 * list.get(j) == cur && !used[j]) {
                            used[j] = true;
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        return false;
                    }
                }
                if (cur >= 0) {
                    for (int j = i; j < list.size(); j++) {
                        if (2 * cur == list.get(j) && !used[j]) {
                            used[j] = true;
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    class Solution1 {
        public boolean canReorderDoubled(int[] arr) {
            Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
            for (int x : arr) {
                cnt.put(x, cnt.getOrDefault(x, 0) + 1);
            }
            if (cnt.getOrDefault(0, 0) % 2 != 0) {
                return false;
            }

            List<Integer> vals = new ArrayList<Integer>();
            for (int x : cnt.keySet()) {
                vals.add(x);
            }
            Collections.sort(vals, (a, b) -> Math.abs(a) - Math.abs(b));

            for (int x : vals) {
                if (cnt.getOrDefault(2 * x, 0) < cnt.get(x)) { // 无法找到足够的 2x 与 x 配对
                    return false;
                }
                cnt.put(2 * x, cnt.getOrDefault(2 * x, 0) - cnt.get(x));
            }
            return true;
        }
    }
}
