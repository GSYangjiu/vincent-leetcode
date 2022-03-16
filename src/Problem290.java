import java.util.HashMap;
import java.util.Map;

/**
 * @author Vincent
 * @date 2022/3/16 10:42 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 单词规律
 * URL: https://leetcode-cn.com/problems/word-pattern/
 * Description：
 */
public class Problem290 {
    class Solution {
        public boolean wordPattern(String pattern, String str) {
            Map<String, Character> str2ch = new HashMap<String, Character>();
            Map<Character, String> ch2str = new HashMap<Character, String>();
            int m = str.length();
            int i = 0;
            for (int p = 0; p < pattern.length(); ++p) {
                char ch = pattern.charAt(p);
                if (i >= m) {
                    return false;
                }
                int j = i;
                while (j < m && str.charAt(j) != ' ') {
                    j++;
                }
                String tmp = str.substring(i, j);
                if (str2ch.containsKey(tmp) && str2ch.get(tmp) != ch) {
                    return false;
                }
                if (ch2str.containsKey(ch) && !tmp.equals(ch2str.get(ch))) {
                    return false;
                }
                str2ch.put(tmp, ch);
                ch2str.put(ch, tmp);
                i = j + 1;
            }
            return i >= m;
        }
    }
}
