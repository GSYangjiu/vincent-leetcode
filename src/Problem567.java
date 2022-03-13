import java.util.Arrays;

/**
 * @author Vincent
 * @date 2022/3/13 11:10 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 字符串的排列
 * URL: https://leetcode-cn.com/problems/permutation-in-string/
 * Description：
 */
public class Problem567 {

    //记s1的长度为n，我们可以遍历s2中的每个长度为n的子串，判断子串和s1中每个字符的个数是否相等，若相等则说明该子串是s1的一个排列
    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            int n = s1.length(), m = s2.length();
            if (n > m) {
                return false;
            }
            int[] cnt1 = new int[26];
            int[] cnt2 = new int[26];
            for (int i = 0; i < n; ++i) {
                ++cnt1[s1.charAt(i) - 'a'];
                ++cnt2[s2.charAt(i) - 'a'];
            }
            if (Arrays.equals(cnt1, cnt2)) {
                return true;
            }
            for (int i = n; i < m; ++i) {
                ++cnt2[s2.charAt(i) - 'a'];
                --cnt2[s2.charAt(i - n) - 'a'];
                if (Arrays.equals(cnt1, cnt2)) {
                    return true;
                }
            }
            return false;
        }
    }
}
