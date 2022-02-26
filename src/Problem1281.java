/**
 * @author Vincent
 * @date 2022/2/26 11:34 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 整数的各位积和之差
 * URL: https://leetcode-cn.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 * Description：
 */
public class Problem1281 {
    public int subtractProductAndSum(int n) {
        int num1 = 0, num2 = 1;
        while (n != 0) {
            num1 += n % 10;
            num2 *= n % 10;
            n = n / 10;
        }
        return num2 - num1;
    }
}
