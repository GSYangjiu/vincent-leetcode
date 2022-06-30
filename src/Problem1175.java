/**
 * @author Vincent
 * @date 2022/6/30 9:27 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 质数排列
 * URL: https://leetcode.cn/problems/prime-arrangements/
 * Description：
 */
public class Problem1175 {
    static class Solution {

        int MOD = 1000000007;

        public int numPrimeArrangements(int n) {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (isPrime(i)) {
                    count++;
                }
            }
            return (int) (factorial(count) * factorial(n - count) % MOD);
        }

        public boolean isPrime(int n) {
            if (n == 1) {
                return false;
            }
            for (int j = 2; j * j <= n; j++) {
                if (n % j == 0) {
                    return false;
                }
            }
            return true;
        }

        public long factorial(int n) {
            long res = 1;
            for (int i = 1; i <= n; i++) {
                res *= i;
                res %= MOD;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().numPrimeArrangements(100));
    }
}
