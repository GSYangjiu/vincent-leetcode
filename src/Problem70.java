/**
 * @author Vincent
 * @date 2022/3/18 11:41 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 爬楼梯
 * URL: https://leetcode-cn.com/problems/climbing-stairs/
 * Description：
 */
public class Problem70 {
    class Solution {
        public int climbStairs(int n) {
            if (n <= 1) {
                return 1;
            }
            int[] cache = new int[n];
            cache[0] = 1;
            cache[1] = 1;
            for (int i = 2; i < n; i++) {
                cache[i] = cache[i - 1] + cache[i - 2];
            }
            return cache[n - 1] + cache[n - 2];
        }
    }
}
