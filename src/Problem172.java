/**
 * @author Vincent
 * @date 2022/3/25 10:02 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 阶乘后的零
 * URL: https://leetcode-cn.com/problems/factorial-trailing-zeroes/
 * Description：
 */
public class Problem172 {
    class Solution {
        public int trailingZeroes(int n) {
            int count = 0;
            while (n > 0) {
                n /= 5;
                count += n;
            }
            return count;
        }
    }
}
