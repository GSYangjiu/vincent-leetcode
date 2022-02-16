/**
 * @author Vincent
 * @date 2022/2/15 7:56 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 移除元素
 * URL: https://leetcode-cn.com/problems/remove-element/
 * Description：
 */
public class Problem27 {
    public int removeElement(int[] nums, int val) {
        int fast = 0, snow = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[snow] = nums[fast];
                snow++;
            }
            fast++;
        }
        return snow;
    }
}
