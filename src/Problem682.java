import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/3/26 11:38 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 棒球比赛
 * URL: https://leetcode-cn.com/problems/baseball-game/
 * Description：
 */
public class Problem682 {
    class Solution {
        public int calPoints(String[] ops) {
            int ret = 0;
            List<Integer> points = new ArrayList<Integer>();
            for (String op : ops) {
                int n = points.size();
                switch (op.charAt(0)) {
                    case '+':
                        ret += points.get(n - 1) + points.get(n - 2);
                        points.add(points.get(n - 1) + points.get(n - 2));
                        break;
                    case 'D':
                        ret += 2 * points.get(n - 1);
                        points.add(2 * points.get(n - 1));
                        break;
                    case 'C':
                        ret -= points.get(n - 1);
                        points.remove(n - 1);
                        break;
                    default:
                        ret += Integer.parseInt(op);
                        points.add(Integer.parseInt(op));
                        break;
                }
            }
            return ret;
        }
    }
}
