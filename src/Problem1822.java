/**
 * @author Vincent
 * @date 2022/2/28 1:03 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 数组元素积的符号
 * URL: https://leetcode-cn.com/problems/sign-of-the-product-of-an-array/
 * Description：
 */
public class Problem1822 {
    public int arraySign(int[] nums) {
        int res = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            }
            if (nums[i] < 0) {
                res = -res;
            }
        }
        return res;
    }
}
