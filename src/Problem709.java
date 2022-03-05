/**
 * @author Vincent
 * @date 2022/3/5 6:16 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 转换成小写字母
 * URL: https://leetcode-cn.com/problems/to-lower-case/solution/zhuan-huan-cheng-xiao-xie-zi-mu-by-leetc-5e29/
 * Description：
 */
public class Problem709 {
    class Solution {
        public String toLowerCase(String s) {
            return s.toLowerCase();
        }
    }

    class Solution1 {
        public String toLowerCase(String s) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); ++i) {
                char ch = s.charAt(i);
                if (ch >= 65 && ch <= 90) {
                    ch |= 32;
                }
                sb.append(ch);
            }
            return sb.toString();
        }
    }
}
