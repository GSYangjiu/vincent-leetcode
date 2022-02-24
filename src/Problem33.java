/**
 * @author Vincent
 * @date 2022/2/24 8:58 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 搜索旋转排序数组
 * URL: https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
 * Description：
 */
public class Problem33 {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
