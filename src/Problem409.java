import java.util.HashSet;
import java.util.Set;

/**
 * @author Vincent
 * @date 2022/3/15 2:40 下午
 * Email: vincent1094259423@yahoo.com
 * Title:最长回文串
 * URL: https://leetcode-cn.com/problems/longest-palindrome/
 * Description：
 */
public class Problem409 {
    class Solution {
        public int longestPalindrome(String s) {
            int res = 0;
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (set.contains(c)) {
                    set.remove(c);
                    res += 2;
                } else {
                    set.add(c);
                }
            }
            if (set.size() != 0) {
                res += 1;
            }
            return res;
        }
    }
}
