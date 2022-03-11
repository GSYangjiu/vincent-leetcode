/**
 * @author Vincent
 * @date 2022/3/11 10:33 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 反转字符串
 * URL: https://leetcode-cn.com/problems/reverse-string/
 * Description：
 */
public class Problem344 {
    class Solution {
        public void reverseString(char[] s) {
            for (int i = 0; i < s.length / 2; i++) {
                char tmp = s[i];
                s[i] = s[s.length - 1 - i];
                s[s.length - 1 - i] = tmp;
            }
        }
    }
}
