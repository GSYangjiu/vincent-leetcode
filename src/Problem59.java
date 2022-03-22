/**
 * @author Vincent
 * @date 2022/3/22 10:48 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 螺旋矩阵II
 * URL: https://leetcode-cn.com/problems/spiral-matrix-ii/
 * Description：
 */
public class Problem59 {
    class Solution {
        public int[][] generateMatrix(int n) {
            int maxNum = n * n;
            int curNum = 1;
            int[][] matrix = new int[n][n];
            int row = 0, col = 0;
            // 右下左上
            int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
            int directionIndex = 0;
            while (curNum <= maxNum) {
                matrix[row][col] = curNum;
                curNum++;
                int nextRow = row + directions[directionIndex][0], nextColumn = col + directions[directionIndex][1];
                if (nextRow < 0 || nextRow >= n || nextColumn < 0 || nextColumn >= n || matrix[nextRow][nextColumn] != 0) {
                    // 顺时针旋转至下一个方向
                    directionIndex = (directionIndex + 1) % 4;
                }
                row = row + directions[directionIndex][0];
                col = col + directions[directionIndex][1];
            }
            return matrix;
        }
    }
}
