/**
 * @author Vincent
 * @date 2022/3/3 3:14 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 矩阵对角线元素的和
 * URL: https://leetcode-cn.com/problems/matrix-diagonal-sum/
 * Description：
 */
public class Problem1572 {
    class Solution {
        public int diagonalSum(int[][] mat) {
            int res = 0;
            int length = mat.length;
            for (int i = 0; i < length; i++) {
                res += mat[i][i];
                res += mat[i][length - i - 1];
            }
            return length % 2 == 0 ? res : res - mat[length / 2][length / 2];
        }
    }
}
