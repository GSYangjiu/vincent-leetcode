import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Vincent
 * @date 2022/3/9 11:27 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 向数组中追加K个整数
 * URL: https://leetcode-cn.com/problems/append-k-integers-with-minimal-sum/
 * Description：
 */
public class Problem2195 {
    static class Solution {
        public long minimalKSum(int[] nums, int k) {
            long res = 0L;
            Arrays.sort(nums);
            int min = 1, count = 0, index = 0;
            while (count < k) {
                if (index >= nums.length || nums[index] > min) {
                    count++;
                    res += min;
                    min += 1;
                } else {
                    min = nums[index] + 1;
                    index++;
                }
            }
            return res;
        }
    }

    class Solution1 {
        public long minimalKSum(int[] nums, int k) {
            Set<Integer> set = new TreeSet<>();
            for (int num : nums) {
                set.add(num);
            }
            set.add(0);
            set.add(Integer.MAX_VALUE);
            // 找出每两个数之间的间隔，算入结果中
            long res = 0;
            int lastNum = 0;
            for (int num : set) {
                int diff = num - lastNum;
                if (diff > 1 && k > 0) {
                    // res += (lastNum+1) + (lastNum+2) + ... + (lastNum+diff-1)且不超过k个
                    long range = Math.min(diff - 1, k);
                    res += (lastNum + 1 + lastNum + range) * range / 2;
                    k -= range;
                }
                lastNum = num;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minimalKSum(new int[]{96, 44, 99, 25, 61, 84, 88, 18, 19, 33, 60, 86, 52, 19, 32, 47, 35, 50, 94, 17, 29, 98, 22, 21, 72, 100, 40, 84}, 35));
    }
}
