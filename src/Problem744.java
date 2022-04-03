/**
 * @author Vincent
 * @date 2022/4/3 8:05 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 寻找比目标字母大的最小字母
 * URL: https://leetcode-cn.com/problems/find-smallest-letter-greater-than-target/
 * Description：
 */
public class Problem744 {
    class Solution {
        public char nextGreatestLetter(char[] letters, char target) {
            if (target >= letters[letters.length - 1]) {
                return letters[0];
            }
            int l = 0, r = letters.length - 1;
            while (l < r) {
                int mid = l + (r - l) / 2;
                if (target - letters[mid] < 0) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            return letters[l];
        }
    }
}
