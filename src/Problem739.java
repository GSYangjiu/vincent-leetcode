import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Vincent
 * @date 2022/3/23 10:38 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 每日温度
 * URL: https://leetcode-cn.com/problems/daily-temperatures/
 * Description：
 */
public class Problem739 {
    class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            int[] res = new int[temperatures.length];
            Arrays.fill(res, 0);
            for (int i = 0; i < temperatures.length; i++) {
                for (int j = i; j < temperatures.length; j++) {
                    if (temperatures[j] > temperatures[i]) {
                        res[i] = j - i;
                        break;
                    }
                }
            }
            return res;
        }
    }

    //单调栈
    class Solution1 {
        public int[] dailyTemperatures(int[] temperatures) {
            int length = temperatures.length;
            int[] ans = new int[length];
            Deque<Integer> stack = new LinkedList<Integer>();
            for (int i = 0; i < length; i++) {
                int temperature = temperatures[i];
                while (!stack.isEmpty() && temperature > temperatures[stack.peek()]) {
                    int prevIndex = stack.pop();
                    ans[prevIndex] = i - prevIndex;
                }
                stack.push(i);
            }
            return ans;
        }
    }
}
