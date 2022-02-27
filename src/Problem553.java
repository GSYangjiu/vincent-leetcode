/**
 * @author Vincent
 * @date 2022/2/27 9:58 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 最优除法
 * URL: https://leetcode-cn.com/problems/optimal-division/
 * Description：
 */
public class Problem553 {
    public String optimalDivision(int[] nums) {
        int n = nums.length;
        Node[][] dp = new Node[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                dp[i][j] = new Node();
            }
        }

        for (int i = 0; i < n; i++) {
            dp[i][i].minVal = nums[i];
            dp[i][i].maxVal = nums[i];
            dp[i][i].minStr = String.valueOf(nums[i]);
            dp[i][i].maxStr = String.valueOf(nums[i]);
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j + i < n; j++) {
                for (int k = j; k < j + i; k++) {
                    if (dp[j][j + i].maxVal < dp[j][k].maxVal / dp[k + 1][j + i].minVal) {
                        dp[j][j + i].maxVal = dp[j][k].maxVal / dp[k + 1][j + i].minVal;
                        if (k + 1 == j + i) {
                            dp[j][j + i].maxStr = dp[j][k].maxStr + "/" + dp[k + 1][j + i].minStr;
                        } else {
                            dp[j][j + i].maxStr = dp[j][k].maxStr + "/(" + dp[k + 1][j + i].minStr + ")";
                        }
                    }
                    if (dp[j][j + i].minVal > dp[j][k].minVal / dp[k + 1][j + i].maxVal) {
                        dp[j][j + i].minVal = dp[j][k].minVal / dp[k + 1][j + i].maxVal;
                        if (k + 1 == j + i) {
                            dp[j][j + i].minStr = dp[j][k].minStr + "/" + dp[k + 1][j + i].maxStr;
                        } else {
                            dp[j][j + i].minStr = dp[j][k].minStr + "/(" + dp[k + 1][j + i].maxStr + ")";
                        }
                    }
                }
            }
        }
        return dp[0][n - 1].maxStr;
    }

    class Node {
        double maxVal, minVal;
        String minStr, maxStr;

        public Node() {
            this.minVal = 10000.0;
            this.maxVal = 0.0;
        }
    }

    /**
     * 结果最大 第二个人数最小即可，后面全乘
     * @param nums
     * @return
     */
    public String optimalDivisionEx(int[] nums) {
        int n = nums.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(nums[i]);
            if (i + 1 < n) sb.append("/");
        }
        if (n > 2) {
            sb.insert(sb.indexOf("/") + 1, "(");
            sb.append(")");
        }
        return sb.toString();
    }
}
