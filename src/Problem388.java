import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Vincent
 * @date 2022/4/20 8:19 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 文件的最长绝对路径
 * URL: https://leetcode-cn.com/problems/longest-absolute-file-path/
 * Description：
 */
public class Problem388 {
    class Solution {
        public int lengthLongestPath(String input) {
            int n = input.length();
            int pos = 0;
            int ans = 0;
            Deque<Integer> stack = new ArrayDeque<Integer>();

            while (pos < n) {
                /* 检测当前文件的深度 */
                int depth = 1;
                while (pos < n && input.charAt(pos) == '\t') {
                    pos++;
                    depth++;
                }
                /* 统计当前文件名的长度 */
                boolean isFile = false;
                int len = 0;
                while (pos < n && input.charAt(pos) != '\n') {
                    if (input.charAt(pos) == '.') {
                        isFile = true;
                    }
                    len++;
                    pos++;
                }
                /* 跳过当前的换行符 */
                pos++;

                while (stack.size() >= depth) {
                    stack.pop();
                }
                if (!stack.isEmpty()) {
                    len += stack.peek() + 1;
                }
                if (isFile) {
                    ans = Math.max(ans, len);
                } else {
                    stack.push(len);
                }
            }
            return ans;
        }
    }
}
