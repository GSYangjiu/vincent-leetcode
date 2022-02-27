/**
 * @author Vincent
 * @date 2022/2/27 9:39 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 找到最近的有相同X或Y坐标的点
 * URL: https://leetcode-cn.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/
 * Description：
 */
public class Problem1779 {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minDis = Integer.MAX_VALUE, index = -1, indexSum = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                int manhattan = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
                if (minDis > manhattan) {
                    minDis = manhattan;
                    index = i;
                    indexSum = points[i][0] + points[i][1];
                } else if (minDis == manhattan) {
                    if ((points[i][0] + points[i][1]) < indexSum) {
                        index = i;
                        indexSum = points[i][0] + points[i][1];
                    }
                }
            }
        }
        return index;
    }
}
