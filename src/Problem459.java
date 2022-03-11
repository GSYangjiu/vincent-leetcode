/**
 * @author Vincent
 * @date 2022/3/11 9:50 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 重复的子字符串
 * URL: https://leetcode-cn.com/problems/repeated-substring-pattern/
 * Description：妙
 */
public class Problem459 {
    class Solution {
        public boolean repeatedSubstringPattern(String s) {
            return (s + s).indexOf(s, 1) != s.length();
        }
    }
}
