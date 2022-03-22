/**
 * @author Vincent
 * @date 2022/3/22 10:35 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 如果相邻两个颜色均相同则删除当前颜色
 * URL: https://leetcode-cn.com/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/
 * Description：
 */
public class Problem2038 {
    class Solution {
        public boolean winnerOfGame(String colors) {
            int countA = 0;
            int countB = 0;
            for (int i = 1; i < colors.length() - 1; i++) {
                if (colors.charAt(i) == 'A') {
                    if (colors.charAt(i - 1) == 'A' && colors.charAt(i + 1) == 'A') {
                        countA++;
                    }
                } else {
                    if (colors.charAt(i - 1) == 'B' && colors.charAt(i + 1) == 'B') {
                        countB++;
                    }
                }
            }
            return countA > countB;
        }
    }
}
