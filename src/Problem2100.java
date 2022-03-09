import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/3/6 11:04 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 适合打劫银行的日子
 * URL: https://leetcode-cn.com/problems/find-good-days-to-rob-the-bank/
 * Description：
 */
public class Problem2100 {
    static class Solution {
            public List<Integer> goodDaysToRobBank(int[] security, int time) {
                List<Integer> res = new ArrayList<>();
                int length = security.length;
                if (length <= 2 * time) {
                    return res;
                }
                for (int i = time; i < security.length - time; i++) {
                    if (time == 0) {
                        res.add(i);
                        continue;
                    }
                    boolean flag = true;
                    if (res.contains(i - 1)) {
                        flag = security[i] <= security[i - 1] && security[i + time - 1] <= security[i + time];
                    } else {
                        for (int l = 0; l < time; l++) {
                            flag = flag && security[i - l] <= security[i - l - 1] && security[i + l] <= security[i + l + 1];
                        }
                    }
                    if (flag) {
                        res.add(i);
                    }
                }
                return res;
            }
    }

    class Solution1 {
        public List<Integer> goodDaysToRobBank(int[] security, int time) {
            int n = security.length;
            int[] left = new int[n];
            int[] right = new int[n];
            for (int i = 1; i < n; i++) {
                if (security[i] <= security[i - 1]) {
                    left[i] = left[i - 1] + 1;
                }
                if (security[n - i - 1] <= security[n - i]) {
                    right[n - i - 1] = right[n - i] + 1;
                }
            }

            List<Integer> ans = new ArrayList<>();
            for (int i = time; i < n - time; i++) {
                if (left[i] >= time && right[i] >= time) {
                    ans.add(i);
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.goodDaysToRobBank(new int[]{1, 2, 3, 4}, 0));
    }
}
