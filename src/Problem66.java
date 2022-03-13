/**
 * @author Vincent
 * @date 2022/3/13 11:21 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 加一
 * URL: https://leetcode-cn.com/problems/plus-one/
 * Description：
 */
public class Problem66 {
    class Solution {
        public int[] plusOne(int[] digits) {
            int n = digits.length;
            int index = n - 1;
            digits[index] += 1;
            while (index > 0 && digits[index] == 10) {
                digits[index] = 0;
                digits[index - 1] += 1;
                index--;
            }
            if (digits[0] == 10) {
                int[] res = new int[digits.length + 1];
                System.arraycopy(digits, 0, res, 1, digits.length);
                res[0] = 1;
                res[1] = 0;
                return res;
            } else {
                return digits;
            }
        }
    }
}
