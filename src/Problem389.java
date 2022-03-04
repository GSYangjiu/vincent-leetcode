import java.util.HashMap;
import java.util.Map;

/**
 * @author Vincent
 * @date 2022/3/4 12:58 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 找不同
 * URL: https://leetcode-cn.com/problems/find-the-difference/
 * Description：
 */
public class Problem389 {
    class Solution {
        public char findTheDifference(String s, String t) {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            }
            for (int i = 0; i < t.length(); i++) {
                int count = map.getOrDefault(t.charAt(i), 0);
                if (count == 0) {
                    return t.charAt(i);
                } else {
                    map.put(t.charAt(i), count - 1);
                }
            }
            return 0;
        }
    }
}
