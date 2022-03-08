/**
 * @author Vincent
 * @date 2022/3/8 11:42 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 区域和检索-数组不可变
 * URL: https://leetcode-cn.com/problems/range-sum-query-immutable/
 * Description：
 */
public class Problem303 {
    class NumArray {
        int[] arr;

        public NumArray(int[] nums) {
            arr = nums;
        }

        public int sumRange(int left, int right) {
            int sum = 0;
            for (int i = 0; i < right - left + 1; i++) {
                sum += arr[left + i];
            }
            return sum;
        }
    }
}
