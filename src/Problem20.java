import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Vincent
 * @date 2022/2/13 1:09 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 有效的括号
 * URL: https://leetcode-cn.com/problems/valid-parentheses/
 * Description：
 */
public class Problem20 {
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> map = new HashMap<Character, Character>() {
            {
                put('}', '{');
                put(')', '(');
                put(']', '[');
            }
        };
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('(' == c || '{' == c || '[' == c) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || !stack.peek().equals(map.get(c))) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Problem20 problem20 = new Problem20();
        System.out.println(problem20.isValid("}"));
    }
}
