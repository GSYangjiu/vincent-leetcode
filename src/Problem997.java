/**
 * @author Vincent
 * @date 2022/3/28 10:32 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 找到小镇的法官
 * URL: https://leetcode-cn.com/problems/find-the-town-judge/
 * Description：
 */
public class Problem997 {
    class Solution {
        public int findJudge(int n, int[][] trust) {
            int[] in = new int[n + 1];
            int[] out = new int[n + 1];
            for (int[] ints : trust) {
                int x = ints[0];
                int y = ints[1];
                in[y]++;
                out[x]++;
            }

            for (int i = 1; i < n + 1; i++) {
                if (in[i] == n - 1 && out[i] == 0) {
                    return i;
                }
            }
            return -1;
        }
    }
}
