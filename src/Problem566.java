import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Vincent
 * @date 2022/2/28 12:19 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 重塑矩阵
 * URL: https://leetcode-cn.com/problems/reshape-the-matrix/
 * Description：
 */
public class Problem566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r * c != mat.length * mat[0].length) {
            return mat;
        }
        int[][] res = new int[r][c];
        Queue<Integer> queue = new LinkedList<>();
        for (int[] ints : mat) {
            for (int anInt : ints) {
                queue.offer(anInt);
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = queue.poll();
            }
        }
        return res;
    }

    //flatten 操作 二维数组转一维数组
    public static int[][] matrixReshapeEx(int[][] nums, int r, int c) {
        int m = nums.length;
        int n = nums[0].length;
        if (m * n != r * c) {
            return nums;
        }

        int[][] ans = new int[r][c];
        for (int x = 0; x < m * n; ++x) {
            ans[x / c][x % c] = nums[x / n][x % n];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = new int[][]{{1, 2}, {3, 4}};
        int r = 1, c = 4;
        System.out.println(Arrays.toString(matrixReshapeEx(mat, r, c)));
    }
}
