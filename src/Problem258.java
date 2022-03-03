/**
 * @author Vincent
 * @date 2022/3/3 10:48 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 各位相加
 * URL: https://leetcode-cn.com/problems/add-digits/
 * Description：
 */
public class Problem258 {
    class Solution {
        public int addDigits(int num) {
            while (num >= 10) {
                int tmp = 0;
                while (num != 0) {
                    tmp += num % 10;
                    num = num / 10;
                }
                num = tmp;
            }
            return num;
        }
    }
}
