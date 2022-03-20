/**
 * @author Vincent
 * @date 2022/3/20 9:35 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 2的幂
 * URL: https://leetcode-cn.com/problems/power-of-two/
 * Description：
 */
public class Problem231 {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n <= 0) return false;
            return Integer.toBinaryString(n).replace("0", "").equals("1");
        }
    }


    class Solution1 {
        public boolean isPowerOfTwo(int n) {
            return n > 0 && (n & (n - 1)) == 0;
        }
    }

    //在题目给定的32位有符号整数的范围内，最大的2的幂为2^30=1073741824。我们只需要判断n是否是的约其数即可。
    class Solution2 {
        static final int BIG = 1 << 30;

        public boolean isPowerOfTwo(int n) {
            return n > 0 && BIG % n == 0;
        }
    }
}
