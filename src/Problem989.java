import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/3/14 5:22 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 数组形式的整数加法
 * URL: https://leetcode-cn.com/problems/add-to-array-form-of-integer/
 * Description：
 */
public class Problem989 {
    static class Solution {
        public List<Integer> addToArrayForm(int[] num, int k) {
            List<Integer> res = new ArrayList<Integer>();
            int n = num.length;
            for (int i = n - 1; i >= 0 || k > 0; --i, k /= 10) {
                if (i >= 0) {
                    k += num[i];
                }
                res.add(0, k % 10);
            }
            Collections.reverse(res);
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addToArrayForm(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, 1));
    }
}
