/**
 * @author Vincent
 * @date 2022/3/2 3:00 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 所有奇数长度子数组的和
 * URL: https://leetcode-cn.com/problems/sum-of-all-odd-length-subarrays/
 * Description：
 */
public class Problem1588 {

    //暴力
    class Solution1 {
        public int sumOddLengthSubarrays(int[] arr) {
            int res = 0;
            int length = 1;
            while (length <= arr.length) {
                res += getSum(arr, length);
                length += 2;
            }
            return res;
        }

        public int getSum(int[] arr, int length) {
            int sum = 0;
            for (int i = 0; i < arr.length - length + 1; i++) {
                for (int j = 0; j < length; j++) {
                    sum += arr[i + j];
                }
            }
            return sum;
        }
    }

    //前缀和
    class Solution2 {
        public int sumOddLengthSubarrays(int[] arr) {
            int n = arr.length;
            int[] prefixSums = new int[n + 1];
            for (int i = 0; i < n; i++) {
                prefixSums[i + 1] = prefixSums[i] + arr[i];
            }
            int sum = 0;
            for (int start = 0; start < n; start++) {
                for (int length = 1; start + length <= n; length += 2) {
                    int end = start + length - 1;
                    sum += prefixSums[end + 1] - prefixSums[start];
                }
            }
            return sum;
        }
    }

    //数学法 计算每个数出现次数，相乘
    class Solution3 {
        public int sumOddLengthSubarrays(int[] arr) {
            int sum = 0;
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                int leftCount = i, rightCount = n - i - 1;
                int leftOdd = (leftCount + 1) / 2;
                int rightOdd = (rightCount + 1) / 2;
                int leftEven = leftCount / 2 + 1;
                int rightEven = rightCount / 2 + 1;
                sum += arr[i] * (leftOdd * rightOdd + leftEven * rightEven);
            }
            return sum;
        }
    }
}
