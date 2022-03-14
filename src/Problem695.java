import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Vincent
 * @date 2022/3/14 4:46 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 岛屿的最大面积
 * URL: https://leetcode-cn.com/problems/max-area-of-island/
 * Description：
 */
public class Problem695 {
    static class Solution {
        int[] dx = {1, 0, 0, -1};
        int[] dy = {0, 1, -1, 0};

        public int maxAreaOfIsland(int[][] grid) {
            int max = 0;
            int m = grid.length;
            int n = grid[0].length;
            int[][] cache = new int[m][n];
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == 1) {
                        int count = 0;
                        Queue<int[]> queue = new LinkedList<>();
                        queue.offer(new int[]{i, j});
                        while (!queue.isEmpty()) {
                            int[] node = queue.poll();
                            if (cache[node[0]][node[1]] == 1) {
                                continue;
                            }
                            cache[node[0]][node[1]] = 1;
                            count++;
                            for (int k = 0; k < 4; k++) {
                                int mx = node[0] + dx[k];
                                int my = node[1] + dy[k];
                                if (mx >= 0 && mx < m && my >= 0 && my < n && grid[mx][my] == 1) {
                                    queue.offer(new int[]{mx, my});
                                }
                            }
                        }
                        max = Math.max(max, count);
                    }
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxAreaOfIsland(new int[][]{{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 1, 1}, {0, 0, 0, 1, 1}}));
    }
}

