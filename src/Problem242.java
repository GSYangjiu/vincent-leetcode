import java.util.Arrays;

/**
 * @author Vincent
 * @date 2022/3/2 1:09 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 有效的字母异位词
 * URL: https://leetcode-cn.com/problems/valid-anagram/
 * Description：
 */
public class Problem242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] chars = new int[26];
        Arrays.fill(chars, 0);
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
            chars[t.charAt(i) - 'a']--;
        }
        for (int num : chars) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
}
