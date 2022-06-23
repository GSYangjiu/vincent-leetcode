import java.util.*;

/**
 * @author Vincent
 * @date 2022/6/23 2:32 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 全排列II
 * URL: https://leetcode.cn/problems/permutations-ii/
 * Description：
 */
public class Problem47 {

    class Solution {

        boolean[] vis;

        public List<List<Integer>> permuteUnique(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> perm = new ArrayList<>();
            vis = new boolean[nums.length];
            Arrays.sort(nums);
            backtrack(nums, perm, res, 0);
            return new ArrayList<>(res);
        }

        private void backtrack(int[] nums, List<Integer> perm, List<List<Integer>> res, int idx) {
            if (idx == nums.length) {
                res.add(new ArrayList<>(perm));
                return;
            }
            for (int i = 0; i < nums.length; ++i) {
                if (vis[i] || (i > 0 && nums[i] == nums[i - 1] && !vis[i - 1])) {
                    continue;
                }
                perm.add(nums[i]);
                vis[i] = true;
                backtrack(nums, perm, res, idx + 1);
                vis[i] = false;
                perm.remove(idx);
            }
        }
    }
}
