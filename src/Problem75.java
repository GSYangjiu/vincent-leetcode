/**
 * @author Vincent
 * @date 2022/3/11 2:36 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 颜色分类
 * URL: https://leetcode-cn.com/problems/sort-colors/
 * Description：
 */
public class Problem75 {
    class Solution {
        public void sortColors(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[i] > nums[j]) {
                        int tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                    }
                }
            }
        }
    }

    //高低位双指针 一个记录最后一个0 一个记录第一个2
    class Solution1 {
        public void sortColors(int[] nums) {
            int n = nums.length;
            int p0 = 0, p2 = n - 1;
            for (int i = 0; i <= p2; ++i) {
                while (i <= p2 && nums[i] == 2) {
                    int temp = nums[i];
                    nums[i] = nums[p2];
                    nums[p2] = temp;
                    --p2;
                }
                if (nums[i] == 0) {
                    int temp = nums[i];
                    nums[i] = nums[p0];
                    nums[p0] = temp;
                    ++p0;
                }
            }
        }
    }
}
