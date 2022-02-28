import java.util.Arrays;

/**
 * @author Vincent
 * @date 2022/2/28 3:47 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 判断能否形成等差数列
 * URL: https://leetcode-cn.com/problems/can-make-arithmetic-progression-from-sequence/
 * Description：
 */
public class Problem1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length - 1; i++) {
            if ((arr[i] - arr[i - 1]) != (arr[i + 1] - arr[i])) {
                return false;
            }
        }
        return true;
    }
}
