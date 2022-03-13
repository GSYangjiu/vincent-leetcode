import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Vincent
 * @date 2022/3/13 11:35 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 逆波兰表达式求值
 * URL: https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/
 * Description：
 */
public class Problem150 {
    class Solution {
        public int evalRPN(String[] tokens) {
            Deque<Integer> stack = new LinkedList<>();
            int n = tokens.length;
            for (int i = 0; i < n; i++) {
                String token = tokens[i];
                if (isNumber(token)) {
                    stack.push(Integer.parseInt(token));
                } else {
                    int num2 = stack.pop();
                    int num1 = stack.pop();
                    switch (token) {
                        case "+":
                            stack.push(num1 + num2);
                            break;
                        case "-":
                            stack.push(num1 - num2);
                            break;
                        case "*":
                            stack.push(num1 * num2);
                            break;
                        case "/":
                            stack.push(num1 / num2);
                            break;
                        default:
                    }
                }
            }
            return stack.pop();
        }

        public boolean isNumber(String token) {
            return !("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token));
        }
    }
}
