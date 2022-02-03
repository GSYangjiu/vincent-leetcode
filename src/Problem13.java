import java.util.HashMap;

/**
 * @author Vincent
 * @date 2022/2/3 8:48 下午
 * Email: vincent1094259423@yahoo.com
 * Description：罗马数转整数 https://leetcode-cn.com/problems/roman-to-integer/
 */
public class Problem13 {

    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            String symbol = symbols[i];
            while (s.startsWith(symbol)) {
                res += value;
                s = s.replaceFirst(symbol, "");
            }
        }
        return res;
    }

    public int romanToIntEx(String s) {
        int num = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 1) {
                if (map.get(chars[i]) < map.get(chars[i + 1])) {
                    //chars数组指中下标i比i+1小 要减
                    num -= map.get(chars[i]);
                } else {
                    //chars数组指中下标i比i+1大 要加
                    num += map.get(chars[i]);
                }
            } else {
                //单独处理最后一位
                num += map.get(chars[i]);
            }
        }
        return num;
    }


    public static void main(String[] args) {
        Problem13 p = new Problem13();
        System.out.println(p.romanToInt("MCCXXXIV"));
    }
}
