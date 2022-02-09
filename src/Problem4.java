import java.util.Arrays;

/**
 * @author Vincent
 * @date 2022/2/8 11:51 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 寻找两个正序数组的中位数
 * URL: https://leetcode-cn.com/problems/median-of-two-sorted-arrays/
 * Description：
 */
public class Problem4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums, 0, nums1.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
        Arrays.sort(nums);
        if (nums.length % 2 == 0) {
            return (double) (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2;
        } else {
            return nums[nums.length / 2];
        }
    }
}
