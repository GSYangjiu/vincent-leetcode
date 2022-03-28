import java.util.HashMap;

/**
 * @author Vincent
 * @date 2022/3/28 3:28 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 和为K的子数组
 * URL: https://leetcode-cn.com/problems/subarray-sum-equals-k/
 * Description：
 */
public class Problem560 {
    public class Solution {
        public int subarraySum(int[] nums, int k) {
            int count = 0, pre = 0;
            HashMap<Integer, Integer> mp = new HashMap<>();
            //关于mp.put(0, 1); 这一行的作用就是为了应对 nums[0] +nums[1] + ... + nums[i] == k 的情况的, 也就是从下标 0 累加到下标 i,
            //举个例子说明, 如数组 [1, 2, 3, 6], 那么这个数组的累加和数组为 [1, 3, 6, 12] 如果 k = 6, 假如map中没有预先 put 一个 (0, 1) ,
            //如果此时我们来到了累加和为 6 的位置, 这时map中的情况是 (1, 1), (3, 1), 而 mp.containsKey(pre - k) , 这时 pre - k 也就是 6 - 6 = 0,
            //因为 map 中没有 (0, 1) 所以 count 的值没有加一, 其实这个时候我们就是忽略了从下标 0 累加到下标 i 等于 k 的情况,
            //我们仅仅是统计了从下标大于 0 到某个位置等于 k 的所有答案
            mp.put(0, 1);
            for (int i = 0; i < nums.length; i++) {
                pre += nums[i];
                if (mp.containsKey(pre - k)) {
                    count += mp.get(pre - k);
                }
                mp.put(pre, mp.getOrDefault(pre, 0) + 1);
            }
            return count;
        }
    }
}
