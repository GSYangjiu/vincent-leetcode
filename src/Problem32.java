import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Vincent
 * @date 2022/3/24 10:03 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 最长有效括号
 * URL: https://leetcode-cn.com/problems/longest-valid-parentheses/
 * Description：
 */
public class Problem32 {
    static class Solution {
        public int longestValidParentheses(String s) {
            int maxans = 0;
            Deque<Integer> stack = new LinkedList<Integer>();
            stack.push(-1);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    stack.push(i);
                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        stack.push(i);
                    } else {
                        maxans = Math.max(maxans, i - stack.peek());
                    }
                }
            }
            return maxans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestValidParentheses("))(())))"));
    }
}
