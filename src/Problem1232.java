/**
 * @author Vincent
 * @date 2022/3/1 5:32 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 缀点成线
 * URL: https://leetcode-cn.com/problems/check-if-it-is-a-straight-line/
 * Description：
 */
public class Problem1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        for (int i = 1; i < coordinates.length - 1; i++) {
            int[] point1 = coordinates[i - 1];
            int[] point2 = coordinates[i];
            int[] point3 = coordinates[i + 1];
            if (!((point2[0] - point1[0]) * (point3[1] - point2[1]) == (point3[0] - point2[0]) * (point2[1] - point1[1]))) {
                return false;
            }
        }
        return true;
    }
}
