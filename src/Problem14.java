/**
 * @author Vincent
 * @date 2022/2/4 10:25 下午
 * Email: vincent1094259423@yahoo.com
 * Description：最长公共前缀 https://leetcode-cn.com/problems/longest-common-prefix/
 */
public class Problem14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) {
            return "";
        }
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            res = longestCommonPrefixForTwoWords(res, strs[i]);
            if ("".equals(res)) break;
        }
        return res;
    }

    public String longestCommonPrefixForTwoWords(String s1, String s2) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s1.length() && i < s2.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                res.append(s1.charAt(i));
            } else {
                return res.toString();
            }
        }
        return res.toString();
    }

    /**
     * 最优解法：二分查找
     * 1、找到String数组中最短字符串，最长公共前缀不会超过最短字符串长度
     * 2、使用二分查找的方式比较最短字符串与其他字符串
     */
    public String longestCommonPrefixEx(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }
        int low = 0, high = minLength;
        while (low < high) {
            int mid = (high - low + 1) / 2 + low;
            if (isCommonPrefix(strs, mid)) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        return strs[0].substring(0, low);
    }

    public boolean isCommonPrefix(String[] strs, int length) {
        String str0 = strs[0].substring(0, length);
        int count = strs.length;
        for (int i = 1; i < count; i++) {
            String str = strs[i];
            for (int j = 0; j < length; j++) {
                if (str0.charAt(j) != str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
