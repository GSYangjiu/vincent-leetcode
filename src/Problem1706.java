import java.util.Arrays;

/**
 * @author Vincent
 * @date 2022/2/24 1:00 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 球会落何处
 * URL: https://leetcode-cn.com/problems/where-will-the-ball-fall/
 * Description：
 */
public class Problem1706 {
    public int[] findBall(int[][] grid) {
        int[] res = new int[grid[0].length];
        for (int i = 0; i < res.length; i++) {
            res[i] = -1;
            int col = i;
            for (int j = 0; j < grid.length; j++) {
                //当前单元格确定往左还是往右,左右单元格确定能否下落
                if (grid[j][col] == 1) {
                    if (col < res.length - 1 && grid[j][col + 1] == 1) {
                        col += 1;
                    } else {
                        break;
                    }
                } else {
                    if (col > 0 && grid[j][col - 1] == -1) {
                        col -= 1;
                    } else {
                        break;
                    }
                }
                if (j == grid.length - 1) {
                    res[i] = col;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Problem1706 problem1706 = new Problem1706();
        System.out.println(Arrays.toString(problem1706.findBall(new int[][]{{1, 1, 1, 1, 1, 1}, {-1, -1, -1, -1, -1, -1}, {1, 1, 1, 1, 1, 1}, {-1, -1, -1, -1, -1, -1}})));
    }
}
