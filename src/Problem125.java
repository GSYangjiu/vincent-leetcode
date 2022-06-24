/**
 * @author Vincent
 * @date 2022/6/23 7:38 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 验证回文串
 * URL: https://leetcode.cn/problems/valid-palindrome/
 * Description：
 */
public class Problem125 {
    class Solution {
        public boolean isPalindrome(String s) {
            StringBuffer sgood = new StringBuffer();
            int length = s.length();
            for (int i = 0; i < length; i++) {
                char ch = s.charAt(i);
                if (Character.isLetterOrDigit(ch)) {
                    sgood.append(Character.toLowerCase(ch));
                }
            }
            StringBuffer sgoodRev = new StringBuffer(sgood).reverse();
            return sgood.toString().equals(sgoodRev.toString());
        }
    }
}
