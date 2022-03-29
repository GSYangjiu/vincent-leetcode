/**
 * @author Vincent
 * @date 2022/3/29 6:26 下午
 * Email: vincent1094259423@yahoo.com
 * Title: Excel表列名称
 * URL: https://leetcode-cn.com/problems/excel-sheet-column-title/
 * Description：
 */
public class Problem168 {
    class Solution {
        public String convertToTitle(int columnNumber) {
            StringBuilder builder = new StringBuilder();
            while (columnNumber != 0) {
                int n = (columnNumber - 1) % 26 + 1;
                builder.append(Character.toChars(n + 'A' - 1));
                columnNumber = (columnNumber - n) / 26;
            }
            return builder.reverse().toString();
        }
    }
}
