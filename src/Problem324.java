import java.util.Arrays;

/**
 * @author Vincent
 * @date 2022/6/28 10:28 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 摆动排序II
 * URL: https://leetcode.cn/problems/wiggle-sort-ii/
 * Description：
 */
public class Problem324 {
    class Solution {
        public void wiggleSort(int[] nums) {
            int length = nums.length;
            Arrays.sort(nums);
            int[] temp = new int[length];
            for (int i = 0; i < nums.length; i++) {
                temp[i] = nums[length - i - 1];
            }
            for (int i = 0; i < length; i++) {
                if (i % 2 == 1) {
                    //从前半段大数取
                    nums[i] = temp[i / 2];
                } else {
                    //从后半段小数取
                    nums[i] = temp[(length + i) / 2];
                }
            }
        }
    }
}