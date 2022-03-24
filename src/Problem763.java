import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/3/24 4:40 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 划分字母区间
 * URL: https://leetcode-cn.com/problems/partition-labels/
 * Description：
 */
public class Problem763 {
    class Solution {
        public List<Integer> partitionLabels(String s) {
            List<Integer> res = new ArrayList<>();
            int[] last = new int[26];
            for (int i = 0; i < s.length(); i++) {
                last[s.charAt(i) - 'a'] = i;
            }
            int start = 0;
            int end = 0;
            for (int i = 0; i < s.length(); i++) {
                end = Math.max(end, last[s.charAt(i) - 'a']);
                if (end == i) {
                    res.add(end - start + 1);
                    start = end + 1;
                }
            }
            return res;
        }
    }
}
