import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Vincent
 * @date 2022/2/8 10:46 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 网格照明
 * URL: https://leetcode-cn.com/problems/grid-illumination/
 * Description：
 */
public class Problem1001 {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        //转换为坐标系 x,y,x+y,x-y
        Map<Integer, Integer> row = new HashMap<>();
        Map<Integer, Integer> col = new HashMap<>();
        Map<Integer, Integer> diagonal = new HashMap<>();
        Map<Integer, Integer> antiDiagonal = new HashMap<>();
        Set<Long> points = new HashSet<>();
        for (int[] lamp : lamps) {
            //使用set去除重复元素
            if (!points.add(hash(lamp[0], lamp[1]))) {
                continue;
            }
            //存在多个灯照亮同一排
            row.put(lamp[0], row.getOrDefault(lamp[0], 0) + 1);
            col.put(lamp[1], col.getOrDefault(lamp[1], 0) + 1);
            diagonal.put(lamp[0] - lamp[1], diagonal.getOrDefault(lamp[0] - lamp[1], 0) + 1);
            antiDiagonal.put(lamp[0] + lamp[1], antiDiagonal.getOrDefault(lamp[0] + lamp[1], 0) + 1);
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int r = queries[i][0], c = queries[i][1];
            if (row.getOrDefault(r, 0) > 0) {
                res[i] = 1;
            } else if (col.getOrDefault(c, 0) > 0) {
                res[i] = 1;
            } else if (diagonal.getOrDefault(r - c, 0) > 0) {
                res[i] = 1;
            } else if (antiDiagonal.getOrDefault(r + c, 0) > 0) {
                res[i] = 1;
            }
            //熄灯
            for (int x = r - 1; x <= r + 1; x++) {
                for (int y = c - 1; y <= c + 1; y++) {
                    if (x < 0 || y < 0 || x >= n || y >= n) {
                        continue;
                    }
                    if (points.remove(hash(x, y))) {
                        row.put(x, row.get(x) - 1);
                        if (row.get(x) == 0) {
                            row.remove(x);
                        }
                        col.put(y, col.get(y) - 1);
                        if (col.get(y) == 0) {
                            col.remove(y);
                        }
                        diagonal.put(x - y, diagonal.get(x - y) - 1);
                        if (diagonal.get(x - y) == 0) {
                            diagonal.remove(x - y);
                        }
                        antiDiagonal.put(x + y, antiDiagonal.get(x + y) - 1);
                        if (antiDiagonal.get(x + y) == 0) {
                            antiDiagonal.remove(x + y);
                        }
                    }
                }
            }
        }
        return res;
    }


    public long hash(int x, int y) {
        return (long) x + ((long) y << 32);
    }
}
