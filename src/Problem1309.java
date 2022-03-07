/**
 * @author Vincent
 * @date 2022/3/7 8:49 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 解码字母到整数映射
 * URL: https://leetcode-cn.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
 * Description：
 */
public class Problem1309 {
    class Solution {
        public String freqAlphabets(String s) {
            Character[] target = new Character[]{' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            StringBuilder sb = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == '#') {
                    String source = s.charAt(i - 2) + String.valueOf(s.charAt(i - 1));
                    sb.append(target[Integer.parseInt(source)]);
                    i -= 2;
                } else {
                    sb.append(target[Integer.parseInt(String.valueOf(s.charAt(i)))]);
                }
            }
            return sb.reverse().toString();
        }
    }
}
