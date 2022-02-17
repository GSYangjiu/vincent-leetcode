/**
 * @author Vincent
 * @date 2022/2/17 8:17 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 骑士在棋盘上的概率
 * URL: https://leetcode-cn.com/problems/knight-probability-in-chessboard/
 * Description：动态规划
 */
public class Problem688 {
    int[][] steps = new int[][]{{1, 2}, {2, 1}, {1, -2}, {2, -1}, {-1, 2}, {-2, 1}, {-1, -2}, {-2, -1}};

    public double knightProbability(int n, int k, int row, int column) {
        double[][][] dp = new double[k + 1][n][n];
        for (int deep = 0; deep <= k; deep++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (deep == 0) {
                        dp[deep][i][j] = 1;
                    } else {
                        for (int[] step : steps) {
                            int tempR = i + step[0], tempC = j + step[1];
                            if (tempR >= 0 && tempR < n && tempC >= 0 && tempC < n) {
                                //状态转移 上一层能走到【i，j】的所有点的概率和
                                dp[deep][i][j] = dp[deep][i][j] + dp[deep - 1][tempR][tempC] / 8;
                            }
                        }

                    }
                }
            }
        }
        return dp[k][row][column];
    }

    public static void main(String[] args) {
        Problem688 problem688 = new Problem688();
        System.out.println(problem688.knightProbability(3,2,0,0));
    }
}
