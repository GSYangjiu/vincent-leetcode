/**
 * @author Vincent
 * @date 2022/2/26 11:18 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 位1的个数
 * URL: https://leetcode-cn.com/problems/number-of-1-bits/
 * Description：位运算
 */
public class Problem191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                res++;
            }
        }
        return res;
    }
}
