import java.util.Arrays;

/**
 * @author Vincent
 * @date 2022/3/11 10:38 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 反转字符串中的单词III
 * URL: https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 * Description：
 */
public class Problem557 {
    class Solution {
        public String reverseWords(String s) {
            StringBuilder builder = new StringBuilder();
            String[] strs = s.split(" ");
            for (int i = 0; i < strs.length; i++) {
                char[] chars = strs[i].toCharArray();
                reverseString(chars);
                builder.append(chars).append(" ");
            }
            return builder.toString().trim();
        }

        public void reverseString(char[] s) {
            for (int i = 0; i < s.length / 2; i++) {
                char tmp = s[i];
                s[i] = s[s.length - 1 - i];
                s[s.length - 1 - i] = tmp;
            }
        }
    }
}
