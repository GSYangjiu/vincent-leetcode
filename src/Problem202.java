/**
 * @author Vincent
 * @date 2022/2/28 6:24 下午
 * Email: vincent1094259423@yahoo.com
 * Title:  快乐数
 * URL: https://leetcode-cn.com/problems/happy-number/
 * Description：
 */
public class Problem202 {

    public boolean isHappy(int n) {
        int sum = getSum(n);
        try {
            while (sum != 1) {
                sum = getSum(sum);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private int getSum(int n) {
        int sum = 0;
        while (n != 0) {
            int tmp = n % 10;
            sum += tmp * tmp;
            n = n / 10;
        }
        return sum;
    }
}
