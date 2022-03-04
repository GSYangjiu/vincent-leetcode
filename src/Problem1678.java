/**
 * @author Vincent
 * @date 2022/3/4 12:40 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 设计Goal解析器
 * URL: https://leetcode-cn.com/problems/goal-parser-interpretation/
 * Description：
 */
public class Problem1678 {
    class Solution {
        public String interpret(String command) {
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < command.length(); i++) {
                if ('G' == command.charAt(i)) {
                    res.append("G");
                } else if ('(' == command.charAt(i)) {
                    if (')' == command.charAt(i + 1)) {
                        res.append("o");
                    } else {
                        res.append("al");
                    }
                }
            }
            return res.toString();
        }
    }
}
