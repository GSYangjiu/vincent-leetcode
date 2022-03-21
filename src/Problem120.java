import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/3/21 5:11 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 三角形最小路径和
 * URL: https://leetcode-cn.com/problems/triangle/
 * Description：
 */
public class Problem120 {
    static class Solution {
        public int minimumTotal(List<List<Integer>> triangle) {
            int res = Integer.MAX_VALUE;
            int length = triangle.size();
            if (length == 1) {
                return triangle.get(0).get(0);
            }
            List<List<Integer>> dp = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                List<Integer> tmpList = new ArrayList<>();
                if (i == 0) {
                    tmpList.add(triangle.get(0).get(0));
                } else {
                    List<Integer> prevRow = dp.get(i - 1);
                    List<Integer> curRow = triangle.get(i);
                    tmpList.add(prevRow.get(0) + curRow.get(0));
                    for (int j = 1; j < triangle.get(i).size() - 1; j++) {
                        tmpList.add(Math.min(prevRow.get(j - 1) + curRow.get(j), prevRow.get(j) + curRow.get(j)));
                    }
                    tmpList.add(prevRow.get(prevRow.size() - 1) + curRow.get(curRow.size() - 1));
                }
                dp.add(tmpList);
            }
            for (int i = 0; i < dp.get(dp.size() - 1).size(); i++) {
                res = Math.min(res, dp.get(dp.size() - 1).get(i));
            }
            return res;
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> param = new ArrayList<>();
        param.add(new ArrayList<Integer>() {{
            add(2);
        }});
        param.add(new ArrayList<Integer>() {{
            add(3);
            add(4);
        }});
        param.add(new ArrayList<Integer>() {{
            add(6);
            add(5);
            add(7);
        }});
        param.add(new ArrayList<Integer>() {{
            add(4);
            add(1);
            add(8);
            add(3);
        }});
        System.out.println(new Solution().minimumTotal(param));
    }
}
