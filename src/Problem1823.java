/**
 * @author Vincent
 * @date 2022/3/30 10:51 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 找出游戏的获胜者
 * URL: https://leetcode-cn.com/problems/find-the-winner-of-the-circular-game/
 * Description：
 */
public class Problem1823 {
    class Solution {
        public int findTheWinner(int n, int k) {
            if (n == 1) return 1;
            int ans = findTheWinner(n - 1, k) + k;
            return ans % n == 0 ? n : (ans % n);
        }
    }
}
