/**
 * @author Vincent
 * @date 2022/3/28 2:07 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 除自身以外数组的乘积
 * URL: https://leetcode-cn.com/problems/product-of-array-except-self/
 * Description：
 */
public class Problem238 {
    static class Solution {
        public int[] productExceptSelf(int[] nums) {
            int length = nums.length;
            int[] left = new int[length];
            int[] right = new int[length];
            int[] answer = new int[length];

            left[0] = 1;
            right[0] = 1;
            for (int i = 1; i < length; i++) {
                left[i] = left[i - 1] * nums[i - 1];
                right[i] = right[i - 1] * nums[length - i];
            }
            for (int i = 0; i < length; i++) {
                answer[i] = left[i] * right[length - i - 1];
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.productExceptSelf(new int[]{1, 2, 3, 4}));
    }
}

