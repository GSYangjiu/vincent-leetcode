import java.util.Arrays;

/**
 * @author Vincent
 * @date 2022/2/24 9:03 下午
 * Email: vincent1094259423@yahoo.com
 * Title:  在排序数组中查找元素的第一个和最后一个位置
 * URL: https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * Description：
 */
public class Problem34 {
    public int[] searchRange(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        int index = -1;
        while (i <= j) {
            int mid = j - (j - i) / 2;
            if (nums[mid] == target) {
                index = mid;
                break;
            } else if (nums[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        if (index == -1) {
            return new int[]{-1, -1};
        }
        int left = index, right = index;
        int[] res = new int[]{left, right};
        while (left >= 0 && nums[left] == target) {
            res[0] = left;
            left--;
        }
        while (right < nums.length && nums[right] == target) {
            res[1] = right;
            right++;
        }
        return res;
    }

    public static void main(String[] args) {
        Problem34 problem34 = new Problem34();
        System.out.println(Arrays.toString(problem34.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)));
    }
}
