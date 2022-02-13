/**
 * @author Vincent
 * @date 2022/2/12 11:48 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 飞地的数量
 * URL: https://leetcode-cn.com/problems/number-of-enclaves/
 * Description：深度优先
 */
public class Problem1020 {
    private int m, n;
    private boolean[][] visited;
    private static int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};


    public int numEnclaves(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            dfs(grid, i, 0);
            dfs(grid, i, n - 1);
        }
        //第一列和最后一列已遍历过，不需要重复遍历
        for (int i = 1; i < n - 1; i++) {
            dfs(grid, 0, i);
            dfs(grid, m - 1, i);
        }
        int res = 0;
        //边界不为飞地 不需要遍历
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (!visited[i][j] && grid[i][j] == 1) {
                    res++;
                }
            }
        }
        return res;
    }

    public void dfs(int[][] grid, int row, int col) {
        //超出边界||不为陆地||已经访问过
        if (row < 0 || row >= m || col < 0 || col >= n || grid[row][col] == 0 || visited[row][col]) {
            return;
        }
        visited[row][col] = true;
        for (int[] dir : dirs) {
            dfs(grid, row + dir[0], col + dir[1]);
        }
    }


    public static void main(String[] args) {
        int[][] grid = new int[][]{{0, 0, 0, 0}, {1, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}};
        Problem1020 problem1020 = new Problem1020();
        System.out.println(problem1020.numEnclaves(grid));
    }
}