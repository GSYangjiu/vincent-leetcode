/**
 * @author Vincent
 * @date 2022/3/4 12:30 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 交替合并字符串
 * URL: https://leetcode-cn.com/problems/merge-strings-alternately/
 * Description：
 */
public class Problem1768 {
    class Solution {
        public String mergeAlternately(String word1, String word2) {
            StringBuilder res = new StringBuilder();
            int index = 0;
            while (index < word1.length() || index < word2.length()) {
                if (index < word1.length()) {
                    res.append(word1.charAt(index));
                }
                if (index < word2.length()) {
                    res.append(word2.charAt(index));
                }
                index++;
            }
            return res.toString();
        }
    }
}
