/**
 * @author Vincent
 * @date 2022/3/24 9:40 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 图片平滑器
 * URL: https://leetcode-cn.com/problems/image-smoother/
 * Description：
 */
public class Problem661 {
    class Solution {
        int[] d = new int[]{-1, 0, 1};
        int m;
        int n;

        public int[][] imageSmoother(int[][] img) {
            m = img.length;
            n = img[0].length;
            int[][] res = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    res[i][j] = getAverage(img, i, j);
                }
            }
            return res;
        }

        private int getAverage(int[][] img, int row, int col) {
            int res = 0;
            int count = 0;
            for (int i = 0; i < 3; i++) {
                int y = row + d[i];
                for (int j = 0; j < 3; j++) {
                    int x = col + d[j];
                    if (x >= 0 && x < n && y >= 0 && y < m) {
                        count++;
                        res += img[y][x];
                    }
                }
            }
            return res / count;
        }
    }
}
