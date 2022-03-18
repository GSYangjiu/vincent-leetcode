/**
 * @author Vincent
 * @date 2022/3/18 11:39 上午
 * Email: vincent1094259423@yahoo.com
 * Title: x的平方根
 * URL: https://leetcode-cn.com/problems/sqrtx/submissions/
 * Description：
 */
public class Problem69 {
    class Solution {
        public int mySqrt(int x) {
            int l = 0, r = x, ans = -1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if ((long) mid * mid <= x) {
                    ans = mid;
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            return ans;
        }
    }
}
