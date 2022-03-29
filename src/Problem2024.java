/**
 * @author Vincent
 * @date 2022/3/29 10:08 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 考试的最大困扰度
 * URL: https://leetcode-cn.com/problems/maximize-the-confusion-of-an-exam/
 * Description：滑动窗口
 */
public class Problem2024 {
    class Solution {
        public int maxConsecutiveAnswers(String answerKey, int k) {
            return Math.max(getMaxLength(answerKey, k, 'T'), getMaxLength(answerKey, k, 'F'));
        }

        private int getMaxLength(String answerKey, int k, char c) {
            int length = answerKey.length();
            int ans = 0;
            for (int l = 0, r = 0, sum = 0; r < length; r++) {
                sum += answerKey.charAt(r) != c ? 1 : 0;
                while (sum > k) {
                    sum -= answerKey.charAt(l) != c ? 1 : 0;
                    l++;
                }
                ans = Math.max(ans, r - l + 1);
            }
            return ans;
        }
    }
}
