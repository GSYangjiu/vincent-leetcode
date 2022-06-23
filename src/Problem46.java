import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/6/23 6:07 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 全排列
 * URL: https://leetcode.cn/problems/permutations/
 * Description：
 */
public class Problem46 {

    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> output = new ArrayList<>();
            for (int i : nums) {
                output.add(i);
            }
            backtrack(nums.length, output, res, 0);
            return res;
        }

        private void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
            if (first == n) {
                res.add(new ArrayList<>(output));
            }
            for (int i = first; i < n; i++) {
                Collections.swap(output, first, i);
                backtrack(n, output, res, first + 1);
                Collections.swap(output, first, i);
            }
        }
    }
}
