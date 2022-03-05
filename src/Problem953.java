/**
 * @author Vincent
 * @date 2022/3/5 6:24 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 验证外星语词典
 * URL: https://leetcode-cn.com/problems/verifying-an-alien-dictionary/
 * Description：
 */
public class Problem953 {
    class Solution {
        public boolean isAlienSorted(String[] words, String order) {
            for (int i = 0; i < words.length - 1; i++) {
                if (checkBigThen(words[i], words[i + 1], order)) {
                    return false;
                }
            }
            return true;
        }

        public boolean checkBigThen(String s1, String s2, String order) {
            int len1 = s1.length();
            int len2 = s2.length();
            int lim = Math.min(len1, len2);

            int k = 0;
            while (k < lim) {
                char c1 = s1.charAt(k);
                char c2 = s2.charAt(k);
                if (c1 != c2) {
                    return order.indexOf(c1) - order.indexOf(c2) > 0;
                }
                k++;
            }
            return len1 - len2 > 0;
        }
    }
}
