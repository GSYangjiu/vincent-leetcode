/**
 * @author Vincent
 * @date 2022/2/2 11:33 上午
 * Email: vincent1094259423@yahoo.com
 * Description：盛最多水的容器 https://leetcode-cn.com/problems/container-with-most-water/
 */
public class Problem11 {

/* 超出时间限制
    public int maxArea(int[] height) {
        if (height.length < 2) return 0;
        int result = 0;
        int maxHigh = height[0];
        for (int i = 0; i < height.length; i++) {
            for (int j = 1; j < height.length; j++) {
            //双重for循环 添加边界条件之后还是超时
                if (Math.max(maxHigh, height[j]) >= maxHigh) {
                    result = Math.max(result, (j - i) * Math.min(height[i], height[j]));
                }
            }
        }
        return result;
    }
*/

    //双指针
    public int maxArea(int[] height) {
        if (height.length < 2) return 0;
        int res = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            res = Math.max(res, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}
