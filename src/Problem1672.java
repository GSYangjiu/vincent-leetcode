/**
 * @author Vincent
 * @date 2022/3/2 4:47 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 最富有客户的资产总量
 * URL: https://leetcode-cn.com/problems/richest-customer-wealth/
 * Description：
 */
public class Problem1672 {
    class Solution {
        public int maximumWealth(int[][] accounts) {
            int max = 0;
            for (int i = 0; i < accounts.length; i++) {
                int sum = 0;
                for (int j = 0; j < accounts[i].length; j++) {
                    sum += accounts[i][j];
                }
                max = Math.max(max, sum);
            }
            return max;
        }
    }
}
