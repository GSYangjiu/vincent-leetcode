/**
 * @author Vincent
 * @date 2022/2/23 10:19 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 仅仅反转字母
 * URL: https://leetcode-cn.com/problems/reverse-only-letters/
 * Description：
 */
public class Problem917 {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (isNotLetter(chars[l])) {
                l++;
                if (l == s.length()) {
                    return s;
                }
            }
            while (isNotLetter(chars[r])) {
                r--;
            }
            if (l >= r) {
                return new String(chars);
            }
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;
        }
        return new String(chars);
    }

    private boolean isNotLetter(char c) {
        return (c < 97 || c > 122) && (c < 65 || c > 90);
    }

    public static void main(String[] args) {
        Problem917 problem917 = new Problem917();
        System.out.println(problem917.reverseOnlyLetters("?6C40E"));
    }
}
