/**
 * @author Vincent
 * @date 2022/3/24 5:20 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 搜索二维矩阵II
 * URL: https://leetcode-cn.com/problems/search-a-2d-matrix-ii/
 * Description：
 */
public class Problem240 {
    static class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length;
            int n = matrix[0].length;
            //二分查找先定位行,找到第一个小于target的行首
            int row = 0;
            while (row < m) {
                if (matrix[row][n - 1] > target) {
                    break;
                }
                row++;
            }
            int col = 0;
            while (col < n) {
                if (matrix[m - 1][col] > target) {
                    break;
                }
                col++;
            }
            for (int i = row; i < m; i++) {
                for (int j = col; j < n; j++) {
                    if (matrix[i][j] == target) {
                        return true;
                    }
                }
            }
            return false;
        }
    }


    //z字形查找
    class Solution1 {
        public boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length, n = matrix[0].length;
            int x = 0, y = n - 1;
            while (x < m && y >= 0) {
                if (matrix[x][y] == target) {
                    return true;
                }
                if (matrix[x][y] > target) {
                    --y;
                } else {
                    ++x;
                }
            }
            return false;
        }
    }
}
