import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/3/7 9:04 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 根据数字二进制下1的数目排序
 * URL: https://leetcode-cn.com/problems/sort-integers-by-the-number-of-1-bits/
 * Description：注意条件 0 <= arr[i] <= 10^4
 */
public class Problem1356 {
    static class Solution {
        public int[] sortByBits(int[] arr) {
            List<Integer> list = new ArrayList<>();
            for (int x : arr) {
                list.add(x);
            }
            int[] bit = new int[10001];
            for (int i = 1; i <= 10000; ++i) {
                bit[i] = bit[i >> 1] + (i & 1);
            }
            list.sort((x, y) -> {
                if (bit[x] != bit[y]) {
                    return bit[x] - bit[y];
                } else {
                    return x - y;
                }
            });
            for (int i = 0; i < arr.length; ++i) {
                arr[i] = list.get(i);
            }
            return arr;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.sortByBits(new int[]{1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1})));
    }
}
