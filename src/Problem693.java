/**
 * @author Vincent
 * @date 2022/3/28 10:08 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 交替位二进制数
 * URL: https://leetcode-cn.com/problems/binary-number-with-alternating-bits/
 * Description：
 */
public class Problem693 {
    class Solution {
        public boolean hasAlternatingBits(int n) {
            int a = n ^ (n >> 1);
            return (a & (a + 1)) == 0;
        }
    }
}
