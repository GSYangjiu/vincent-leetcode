import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/2/14 11:08 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 括号生成
 * URL: https://leetcode-cn.com/problems/generate-parentheses/
 * Description：
 */
public class Problem22 {
    ArrayList[] cache = new ArrayList[100];

    public List<String> generateParenthesis(int n) {
        return generate(n);
    }

    //任何一个括号序列都一定是由 ( 开头，并且第一个 ( 一定有一个唯一与之对应的 )。这样一来，每一个括号序列可以用 (a)b 来表示，其中 a 与 b 分别是一个合法的括号序列（可以为空）。
    //(left)right
    public List<String> generate(int n) {
        if (cache[n] != null) {
            return cache[n];
        }
        ArrayList<String> res = new ArrayList<>();
        if (n == 0) {
            res.add("");
        } else {
            for (int i = 0; i < n; i++) {
                for (String left : generate(i)) {
                    for (String right : generate(n - 1 - i)) {
                        res.add("(" + left + ")" + right);
                    }
                }
            }
        }
        cache[n] = res;
        return res;
    }

    //回溯法
    static class Problem22Ex {
        public List<String> generateParenthesis(int n) {
            List<String> ret = new ArrayList<String>();
            backtrace(ret, new StringBuilder(), 0, 0, n);
            return ret;
        }

        //深度优先 到达后回溯
        private void backtrace(List<String> ret, StringBuilder sb, int open, int close, int max) {
            if (sb.length() == max * 2) {
                ret.add(sb.toString());
                return;
            }
            if (open < max) {
                sb.append('(');
                backtrace(ret, sb, open + 1, close, max);
                sb.deleteCharAt(sb.length() - 1);
            }
            if (close < open) {
                sb.append(')');
                backtrace(ret, sb, open, close + 1, max);
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        public static void main(String[] args) {
            Problem22Ex problem22Ex = new Problem22Ex();
            System.out.println(problem22Ex.generateParenthesis(3));
        }
    }
}

