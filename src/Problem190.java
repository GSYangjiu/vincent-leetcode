/**
 * @author Vincent
 * @date 2022/3/21 10:07 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 颠倒二进制位
 * URL: https://leetcode-cn.com/problems/reverse-bits/
 * Description：
 */
public class Problem190 {
    public class Solution {
        public int reverseBits(int n) {
            int rev = 0;
            for (int i = 0; i < 32 && n != 0; ++i) {
                rev |= (n & 1) << (31 - i);
                n >>>= 1;
            }
            return rev;
        }
    }
}
