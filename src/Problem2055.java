import java.util.Arrays;

/**
 * @author Vincent
 * @date 2022/3/8 2:34 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 蜡烛之间的盘子
 * URL: https://leetcode-cn.com/problems/plates-between-candles/
 * Description：预处理 + 前缀和
 */
public class Problem2055 {
    static class Solution {
        public int[] platesBetweenCandles(String s, int[][] queries) {
            int n = s.length();
            //预处理 前缀和 【x,y】中的盘子数等于y前盘子数减去x前盘子数
            int[] preSum = new int[n];
            for (int i = 0, sum = 0; i < n; i++) {
                if (s.charAt(i) == '*') {
                    sum++;
                }
                preSum[i] = sum;
            }
            //找到左右两侧第一个蜡烛（|）
            int[] left = new int[n];
            for (int i = 0, l = -1; i < n; i++) {
                if (s.charAt(i) == '|') {
                    l = i;
                }
                left[i] = l;
            }
            int[] right = new int[n];
            for (int i = n - 1, r = -1; i >= 0; i--) {
                if (s.charAt(i) == '|') {
                    r = i;
                }
                right[i] = r;
            }
            int[] ans = new int[queries.length];
            for (int i = 0; i < queries.length; i++) {
                int[] query = queries[i];
                //x右边的第一个蜡烛，y左边的第一个蜡烛
                int x = right[query[0]], y = left[query[1]];
                ans[i] = x == -1 || y == -1 || x >= y ? 0 : preSum[y] - preSum[x];
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.platesBetweenCandles("***|**|*****|**||**|*", new int[][]{{1, 17}, {4, 5}, {14, 17}})));
    }
}
