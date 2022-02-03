/**
 * @author Vincent
 * @date 2022/2/3 8:48 下午
 * Email: vincent1094259423@yahoo.com
 * Description：整数转罗马数字 https://leetcode-cn.com/problems/integer-to-roman/
 */
public class Problem12 {

    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


    //贪心算法
    public String intToRoman(int num) {
        StringBuffer roman = new StringBuffer();
        for (int i = 0; i < values.length; ++i) {
            int value = values[i];
            String symbol = symbols[i];
            while (num >= value) {
                num -= value;
                roman.append(symbol);
            }
            if (num == 0) {
                break;
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        Problem12 p = new Problem12();
        System.out.println(p.intToRoman(125));
    }
}
