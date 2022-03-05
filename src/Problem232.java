import java.util.Stack;

/**
 * @author Vincent
 * @date 2022/3/5 4:54 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 用栈实现队列
 * URL: https://leetcode-cn.com/problems/implement-queue-using-stacks/
 * Description：
 */
public class Problem232 {
    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */
    class MyQueue {

        Stack<Integer> stack;

        public MyQueue() {
            stack = new Stack<>();
        }

        public void push(int x) {
            int[] temps = new int[stack.size()];
            for (int i = 0; i < temps.length; i++) {
                temps[i] = stack.pop();
            }
            stack.push(x);
            for (int i = temps.length; i > 0; i--) {
                stack.push(temps[i - 1]);
            }
        }

        public int pop() {
            return stack.pop();
        }

        public int peek() {
            return stack.peek();
        }

        public boolean empty() {
            return stack.isEmpty();
        }
    }
}
