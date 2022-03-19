import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Vincent
 * @date 2022/3/19 8:22 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 重复的DNA序列
 * URL: https://leetcode-cn.com/problems/repeated-dna-sequences/
 * Description：
 */
public class Problem187 {
    static class Solution {
        public List<String> findRepeatedDnaSequences(String s) {
            List<String> res = new ArrayList<>();
            if (s.length() <= 10) {
                return res;
            }
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length() - 9; i++) {
                String str = s.substring(i, i + 10);
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
            for (String key : map.keySet()) {
                if (map.get(key) > 1) {
                    res.add(key);
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findRepeatedDnaSequences("AAAAAAAAAAA"));
    }
}
