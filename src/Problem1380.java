import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/2/15 10:13 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 矩阵中的幸运数
 * URL: https://leetcode-cn.com/problems/lucky-numbers-in-a-matrix/
 * Description：
 */
public class Problem1380 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int index = 0;
            int temp = matrix[i][0];
            //每行最大值
            for (int j = 1; j < matrix[i].length; j++) {
                if (temp > matrix[i][j]) {
                    index = j;
                    temp = matrix[i][j];
                }
            }

            int tempMax = temp;
            for (int j = 0; j < matrix.length; j++) {
                tempMax = Math.max(tempMax, matrix[j][index]);
                if (temp != tempMax) {
                    break;
                }
            }
            if (tempMax == temp) {
                res.add(temp);
            }
        }
        return res;
    }
}
