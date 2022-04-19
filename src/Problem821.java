import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/4/19 10:22 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 字符的最短距离
 * URL: https://leetcode-cn.com/problems/shortest-distance-to-a-character/
 * Description：
 */
public class Problem821 {
    static class Solution {
        public int[] shortestToChar(String s, char c) {
            int[] res = new int[s.length()];
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    list.add(i);
                }
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    res[i] = 0;
                } else {
                    int min = i - list.get(list.size() - 1);
                    for (int j = 0; j < list.size(); j++) {
                        if (list.get(j) > i) {
                            if (j != 0) {
                                min = Math.min(list.get(j) - i, i - list.get(j - 1));
                            } else {
                                min = list.get(j) - i;
                            }
                            break;
                        }
                    }
                    res[i] = min;
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().shortestToChar("loveleetcode", 'e')));
    }

    class Solution1 {
        public int[] shortestToChar(String s, char c) {
            int n = s.length();
            int[] ans = new int[n];

            for (int i = 0, idx = -n; i < n; ++i) {
                if (s.charAt(i) == c) {
                    idx = i;
                }
                ans[i] = i - idx;
            }

            for (int i = n - 1, idx = 2 * n; i >= 0; --i) {
                if (s.charAt(i) == c) {
                    idx = i;
                }
                ans[i] = Math.min(ans[i], idx - i);
            }
            return ans;
        }
    }
}
