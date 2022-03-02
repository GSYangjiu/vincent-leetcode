/**
 * @author Vincent
 * @date 2022/3/2 3:38 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 移动零
 * URL: https://leetcode-cn.com/problems/move-zeroes/
 * Description：
 */
public class Problem283 {
    class Solution {
        public void moveZeroes(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    int j = i + 1;
                    while (j < nums.length && nums[j] == 0) {
                        j++;
                    }
                    if (j != nums.length) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                    }
                }
            }
        }
    }

    class Solution1 {
        public void moveZeroes(int[] nums) {
            int slow = 0, fast = 0;
            while (fast < nums.length) {
                if (nums[fast] != 0) {
                    int tmp = nums[fast];
                    nums[fast] = nums[slow];
                    nums[slow] = tmp;
                    slow++;
                }
                fast++;
            }
        }
    }
}
