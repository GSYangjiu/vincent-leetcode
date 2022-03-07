/**
 * @author Vincent
 * @date 2022/3/7 2:07 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 七进制
 * URL: https://leetcode-cn.com/problems/base-7/
 * Description：
 */
public class Problem504 {
    static class Solution {
        public String convertToBase7(int num) {
            if (num == 0) return "0";
            String res = "";
            boolean flag = num < 0;
            num = Math.abs(num);
            while (num != 0) {
                res = num % 7 + res;
                num = num / 7;
            }
            if (flag) {
                res = "-" + res;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convertToBase7(-9));
    }
}
