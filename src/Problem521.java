/**
 * @author Vincent
 * @date 2022/3/5 4:34 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 最长特殊序列Ⅰ
 * URL: https://leetcode-cn.com/problems/longest-uncommon-subsequence-i/
 * Description：
 */
public class Problem521 {
    class Solution {
        public int findLUSlength(String a, String b) {
            if (a.equals(b)) {
                return -1;
            } else {
                return Math.max(a.length(), b.length());
            }
        }
    }
}
