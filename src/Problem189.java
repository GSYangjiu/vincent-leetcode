import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/3/9 3:29 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 轮转数组
 * URL: https://leetcode-cn.com/problems/rotate-array/
 * Description：
 */
public class Problem189 {
    class Solution {
        public void rotate(int[] nums, int k) {
            if (k == nums.length) {
                return;
            }
            k = k % nums.length;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[(nums.length - k + i) % nums.length]);
            }
            for (int i = 0; i < list.size(); i++) {
                nums[i] = list.get(i);
            }
        }
    }

    //两次翻转
    class Solution1 {
        public void rotate(int[] nums, int k) {
            k %= nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);
        }

        public void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start += 1;
                end -= 1;
            }
        }
    }
}
