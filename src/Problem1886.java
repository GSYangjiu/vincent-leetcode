/**
 * @author Vincent
 * @date 2022/3/18 11:29 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 判断矩阵经轮转后是否一致
 * URL: https://leetcode-cn.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
 * Description：
 */
public class Problem1886 {
    class Solution {
        public boolean findRotation(int[][] mat, int[][] target) {
            int n = mat.length;
            boolean b1 = true, b2 = true, b3 = true, b4 = true;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    //旋转90度
                    if (mat[n - j - 1][i] != target[i][j]) {
                        b1 = false;
                    }
                    //旋转180度
                    if (mat[n - i - 1][n - j - 1] != target[i][j]) {
                        b2 = false;
                    }
                    //旋转270度
                    if (mat[j][n - i - 1] != target[i][j]) {
                        b3 = false;
                    }
                    //旋转360度
                    if (mat[i][j] != target[i][j]) {
                        b4 = false;
                    }
                }
                if (!b1 && !b2 && !b3 && !b4) {
                    return false;
                }
            }
            return true;
        }
    }
}
