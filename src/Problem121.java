/**
 * @author Vincent
 * @date 2022/2/27 8:45 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 买卖股票的最佳时机
 * URL: https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * Description：
 */
public class Problem121 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int ans = 0, premin = prices[0];
        for (int i = 1; i < n; ++i) {
            if (prices[i] > premin) {
                ans = Math.max(ans, prices[i] - premin);
            } else {
                premin = prices[i];
            }
        }
        return ans;
    }
}
