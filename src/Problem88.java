/**
 * @author Vincent
 * @date 2022/2/26 10:16 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 合并两个有序数组
 * URL: https://leetcode-cn.com/problems/merge-sorted-array/
 * Description：
 */
public class Problem88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        int[] sorted = new int[m + n];
        int cur;

        while (i < m || j < n) {
            if (i == m) {
                cur = nums2[j++];
            } else if (j == n) {
                cur = nums1[i++];
            } else if (nums1[i] > nums2[j]) {
                cur = nums2[j++];
            } else {
                cur = nums1[i++];
            }
            sorted[i + j - 1] = cur;
        }
        for (int k = 0; k < sorted.length; k++) {
            nums1[k] = sorted[k];
        }
    }
}
