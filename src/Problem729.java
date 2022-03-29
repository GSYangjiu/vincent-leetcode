import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/3/29 5:37 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 我的日程安排表I
 * URL: https://leetcode-cn.com/problems/my-calendar-i/
 * Description：
 */
public class Problem729 {
    public class MyCalendar {
        List<int[]> calendar;

        MyCalendar() {
            calendar = new ArrayList<>();
        }

        public boolean book(int start, int end) {
            for (int[] iv : calendar) {
                if (iv[0] < end && start < iv[1]) return false;
            }
            calendar.add(new int[]{start, end});
            return true;
        }
    }
}
