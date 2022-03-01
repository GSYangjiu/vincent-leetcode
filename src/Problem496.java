import java.util.Arrays;

/**
 * @author Vincent
 * @date 2022/3/1 5:18 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 下一个更大元素I
 * URL: https://leetcode-cn.com/problems/next-greater-element-i/
 * Description：
 */
public class Problem496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Arrays.fill(res, -1);

        for (int i = 0; i < nums1.length; i++) {
            boolean flag = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    flag = true;
                }
                if (flag && nums2[j] > nums1[i]) {
                    res[i] = nums2[j];
                    break;
                }
            }
        }
        return res;
    }
}
