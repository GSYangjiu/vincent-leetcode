/**
 * @author Vincent
 * @date 2022/2/15 7:30 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 删除有序数组中的重复项
 * URL: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * Description：
 */
public class Problem26 {
    public int removeDuplicates(int[] nums) {
        int fast = 1, snow = 1;
        while (fast < nums.length) {
            if (nums[fast] != nums[fast - 1]) {
                nums[snow] = nums[fast];
                snow++;
            }
            fast++;
        }
        return snow;
    }

    public static void main(String[] args) {
        Problem26 problem26 = new Problem26();
        problem26.removeDuplicates(new int[]{0, 0, 1, 1, 2, 2, 3, 3});
    }
}
