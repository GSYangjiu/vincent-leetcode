/**
 * @author Vincent
 * @date 2022/3/15 2:51 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 最后一个单词的长度
 * URL: https://leetcode-cn.com/problems/length-of-last-word/
 * Description：
 */
public class Problem58 {
    class Solution {
        public int lengthOfLastWord(String s) {
            String[] strs = s.split(" ");
            return strs.length == 0 ? 0 : strs[strs.length - 1].length();
        }
    }
}
