/**
 * @author Vincent
 * @date 2022/2/14 10:35 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 有序数组中的单一元素
 * URL: https://leetcode-cn.com/problems/single-element-in-a-sorted-array/
 * Description：二分查找 异或
 */
public class Problem540 {
    public int singleNonDuplicate(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (r - l) / 2 + l;
            //异或1 奇减偶加
            if (nums[mid] == nums[mid ^ 1]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return nums[l];
    }
}
