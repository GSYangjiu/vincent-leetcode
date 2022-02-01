/**
 * @author Vincent
 * @date 2022/1/31 9:34 下午
 * Email: vincent1094259423@yahoo.com
 * Description：整数翻转 https://leetcode-cn.com/problems/reverse-integer/
 */
public class Problem7 {
    public int reverse(int x) {
        int digit;
        digit = (Math.abs(x) + "").length();
        int num = 0;
        for (int i = 0; i < digit; i++) {
            num += Double.valueOf(x / Math.pow(10, i)).intValue() % 10 * Math.pow(10, digit - i - 1);
            if (num >= Integer.MAX_VALUE || num <= Integer.MIN_VALUE) {
                return 0;
            }
        }
        return num;
    }

    public int reverseEx(int x) {
        int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x /= 10;
            rev = rev * 10 + digit;
        }
        return rev;
    }
}
