/**
 * @author Vincent
 * @date 2022/2/25 8:34 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 复数乘法
 * URL: https://leetcode-cn.com/problems/complex-number-multiplication/
 * Description：
 */
public class Problem534 {
    public String complexNumberMultiply(String num1, String num2) {
        String[] number0 = num1.split("\\+");
        String[] number1 = num2.split("\\+");
        int n1 = Integer.valueOf(number0[0]);
        int n2 = Integer.valueOf(number1[0]);
        int n3 = Integer.valueOf(number0[1].substring(0, number0[1].length() - 1));
        int n4 = Integer.valueOf(number1[1].substring(0, number1[1].length() - 1));
        int x = n1 * n2 - n3 * n4;
        int y = n1 * n4 + n2 * n3;
        return x + "+" + y + "i";
    }

    public static void main(String[] args) {
        String num1 = "1+-1i", num2 = "1+-1i";
        Problem534 problem534 = new Problem534();
        System.out.println(problem534.complexNumberMultiply(num1, num2));
    }
}
