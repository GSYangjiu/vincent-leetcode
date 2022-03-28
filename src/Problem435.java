import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Vincent
 * @date 2022/3/28 10:42 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 无重叠区间
 * URL: https://leetcode-cn.com/problems/non-overlapping-intervals/
 * Description：
 */
public class Problem435 {
    class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
            //将区间按右边界升序排序
            Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
            int count = 0;
            int cur = intervals[0][1];
            for (int i = 1; i < intervals.length; ++i) {
                if (intervals[i][0] < cur) {
                    count++;
                } else {
                    cur = intervals[i][1];
                }
            }
            return count;
        }
    }
}
