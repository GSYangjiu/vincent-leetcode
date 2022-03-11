import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/3/11 2:54 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 合并区间
 * URL: https://leetcode-cn.com/problems/merge-intervals/
 * Description：
 */
public class Problem56 {
    class Solution {
        public int[][] merge(int[][] intervals) {
            if (intervals.length == 0) {
                return new int[0][2];
            }
            Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
            List<int[]> merged = new ArrayList<>();
            for (int i = 0; i < intervals.length; ++i) {
                int L = intervals[i][0], R = intervals[i][1];
                if (merged.size() == 0 || merged.get(merged.size() - 1)[1] < L) {
                    merged.add(new int[]{L, R});
                } else {
                    merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], R);
                }
            }
            return merged.toArray(new int[merged.size()][]);
        }
    }
}
