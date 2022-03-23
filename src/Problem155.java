import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Vincent
 * @date 2022/3/23 10:25 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 最小栈
 * URL: https://leetcode-cn.com/problems/min-stack/
 * Description：
 */
public class Problem155 {
    class MinStack {

        Deque<Integer> stack;
        Deque<Integer> minStack;

        public MinStack() {
            stack = new LinkedList<>();
            minStack = new LinkedList<>();
            minStack.push(Integer.MAX_VALUE);
        }

        public void push(int val) {
            stack.push(val);
            minStack.push(Math.min(minStack.peek(), val));
        }

        public void pop() {
            stack.pop();
            minStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }
}
