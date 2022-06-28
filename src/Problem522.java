/**
 * @author Vincent
 * @date 2022/6/27 5:21 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 最长特殊序列II
 * URL: https://leetcode.cn/problems/longest-uncommon-subsequence-ii/
 * Description：
 */
public class Problem522 {
    class Solution {
        public int findLUSlength(String[] strs) {
            int res = -1;
            for (int i = 0; i < strs.length; i++) {
                String str = strs[i];
                boolean check = true;
                for (int j = 0; j < strs.length; j++) {
                    if (j != i && isSubseq(str, strs[j])) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    res = Math.max(res, strs[i].length());
                }
            }
            return res;
        }

        private boolean isSubseq(String s1, String s2) {
            int i = 0, j = 0;
            while (i < s1.length() && j < s2.length()) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    i++;
                }
                j++;
            }
            return i == s1.length();
        }
    }
}
