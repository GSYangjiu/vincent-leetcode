/**
 * @author Vincent
 * @date 2022/5/24 6:53 下午
 * Email: vincent1094259423@yahoo.com
 * Title: Pow(x, n)
 * URL: https://leetcode.cn/problems/powx-n/
 * Description：
 */
public class Problem50 {

    //超时
    class Solution {
        public double myPow(double x, int n) {
            double res = 1;
            for (int i = 0; i < Math.abs(n); i++) {
                res = n > 0 ? res * x : res / x;
            }
            return res;
        }
    }

    //二分法迭代
    class Solution1 {
        public double myPow(double x, int n) {
            long N = n;
            return n > 0 ? quickMul(x, N) : 1 / quickMul(x, N);
        }

        private double quickMul(double x, long n) {
            if (n == 0) {
                return 1;
            }
            double y = quickMul(x, n / 2);
            return n % 2 == 0 ? y * y : y * y * x;
        }
    }
}
