import java.util.HashSet;
import java.util.Set;

/**
 * @author Vincent
 * @date 2022/2/26 4:01 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 最长的美好子字符串
 * URL: https://leetcode-cn.com/problems/longest-nice-substring/
 * Description：
 */
public class Problem1763 {
        public String longestNiceSubstring(String s) {
                int n = s.length();
                String ans = "";
                for (int i = 0; i < n; i++) {
                        for (int j = i + 1; j < n; j++) {
                                if (j - i + 1 > ans.length() && check(s.substring(i, j + 1)))
                                        ans = s.substring(i, j + 1);
                        }
                }
                return ans;
        }

        boolean check(String s) {
                Set<Character> set = new HashSet<>();
                for (char c : s.toCharArray()) set.add(c);
                for (char c : s.toCharArray()) {
                        char a = Character.toLowerCase(c), b = Character.toUpperCase(c);
                        if (!set.contains(a) || !set.contains(b)) return false;
                }
                return true;
        }

        public String longestNiceSubstringEx(String s) {
                int n = s.length();
                int idx = -1, len = 0;
                for (int i = 0; i < n; i++) {
                        int a = 0, b = 0;
                        for (int j = i; j < n; j++) {
                                char c = s.charAt(j);
                                if (c >= 'a' && c <= 'z'){
                                        a |= (1 << (c - 'a'));
                                }
                                else b |= (1 << (c - 'A'));
                                if (a == b && j - i + 1 > len) {
                                        idx = i;
                                        len = j - i + 1;
                                }
                        }
                }
                return idx == -1 ? "" : s.substring(idx, idx + len);
        }
}
