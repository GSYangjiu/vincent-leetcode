/**
 * @author Vincent
 * @date 2022/3/11 10:47 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 两数之和II-输入有序数组
 * URL: https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
 * Description：
 */
public class Problem167 {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            for (int i = 1; i < numbers.length; i++) {
                int tmp = target - numbers[i];
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[j] == tmp) {
                        return new int[]{i, j};
                    } else if (numbers[j] > tmp) {
                        break;
                    }
                }
            }
            return null;
        }
    }

    class Solution1 {
        public int[] twoSum(int[] numbers, int target) {
            int low = 0, high = numbers.length - 1;
            while (low < high) {
                int sum = numbers[low] + numbers[high];
                if (sum == target) {
                    return new int[]{low + 1, high + 1};
                } else if (sum < target) {
                    ++low;
                } else {
                    --high;
                }
            }
            return new int[]{-1, -1};
        }
    }
}
