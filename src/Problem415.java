/**
 * @author Vincent
 * @date 2022/3/15 2:03 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 字符串相加
 * URL: https://leetcode-cn.com/problems/add-strings/
 * Description：
 */
public class Problem415 {
    class Solution {
        public String addStrings(String num1, String num2) {
            StringBuilder builder = new StringBuilder();
            int i = num1.length() - 1;
            int j = num2.length() - 1;
            int tmp = 0;
            while (i >= 0 || j >= 0 || tmp != 0) {
                int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
                int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
                tmp = n1 + n2 + tmp;
                builder.append(tmp % 10);
                tmp = tmp / 10;
                i--;
                j--;
            }
            return builder.reverse().toString();
        }
    }
}
