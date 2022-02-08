import java.util.Arrays;

/**
 * @author Vincent
 * @date 2022/2/7 8:35 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 最长快乐字符串
 * URL: https://leetcode-cn.com/problems/longest-happy-string/
 * Description：贪心算法
 * 执行用时：1 ms, 在所有 Java 提交中击败了81.73%的用户
 * 内存消耗：38.5 MB, 在所有 Java 提交中击败了14.42%的用户
 */
public class Problem1405 {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder res = new StringBuilder();
        Pair[] arr = {new Pair(a, 'a'), new Pair(b, 'b'), new Pair(c, 'c')};

        while (true) {
            Arrays.sort(arr, (p1, p2) -> p2.freq - p1.freq);
            boolean hasNext = false;
            for (Pair pair : arr) {
                //无其他元素（排序，最多元素等于0，其他元素都为0）跳出循环 hasNext为false
                if (pair.freq <= 0) {
                    break;
                }
                int m = res.length();
                if (m >= 2 && res.charAt(m - 2) == pair.ch && res.charAt(m - 1) == pair.ch) {
                    continue;
                }
                hasNext = true;
                res.append(pair.ch);
                pair.freq--;
                break;
            }
            if (!hasNext) {
                break;
            }
        }
        return res.toString();
    }

    class Pair {
        int freq;
        char ch;

        public Pair(int freq, char ch) {
            this.freq = freq;
            this.ch = ch;
        }

    }

    public static void main(String[] args) {
        Problem1405 problem1405 = new Problem1405();
        System.out.println(problem1405.longestDiverseString(1, 1, 7));
    }
}
