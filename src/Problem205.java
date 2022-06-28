import java.util.HashMap;
import java.util.Map;

/**
 * @author Vincent
 * @date 2022/6/28 11:24 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 同构字符串
 * URL: https://leetcode.cn/problems/isomorphic-strings/
 * Description：
 */
public class Problem205 {
    static class Solution {
        public boolean isIsomorphic(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }

            Map<Character, Character> s2t = new HashMap<>();
            Map<Character, Character> t2s = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char c1 = s.charAt(i);
                char c2 = t.charAt(i);
                if ((s2t.containsKey(c1) && s2t.get(c1) != c2) || (t2s.containsKey(c2) && t2s.get(c2) != c1)) {
                    return false;
                }
                s2t.put(c1, c2);
                t2s.put(c2, c1);
            }
            return true;
        }
    }

    class Solution1 {
        public boolean isIsomorphic(String s, String t) {
            char[] chars = s.toCharArray();
            char[] chart = t.toCharArray();
            int[] preIndexOfs = new int[256];
            int[] preIndexOft = new int[256];
            for (int i = 0; i < chars.length; i++) {
                if (preIndexOfs[chars[i]] != preIndexOft[chart[i]]) {
                    return false;
                }
                preIndexOfs[chars[i]] = i + 1;
                preIndexOft[chart[i]] = i + 1;
            }

            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isIsomorphic("foo", "bar"));
    }
}
