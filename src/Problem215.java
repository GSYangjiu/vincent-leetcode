import java.util.Arrays;

/**
 * @author Vincent
 * @date 2022/3/29 10:43 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 数组中的第K个最大元素
 * URL: https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 * Description：
 */
public class Problem215 {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            Arrays.sort(nums);
            return nums[nums.length - k];
        }
    }
}
