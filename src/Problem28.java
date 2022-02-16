/**
 * @author Vincent
 * @date 2022/2/15 8:00 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 实现 strStr()
 * URL: https://leetcode-cn.com/problems/implement-strstr/
 * Description：
 */
public class Problem28 {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        if (haystack == null || haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0; i < haystack.length() - needle.length(); i++) {
            int j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}
