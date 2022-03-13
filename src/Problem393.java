import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/3/13 10:23 下午
 * Email: vincent1094259423@yahoo.com
 * Title: UTF-8编码验证
 * URL: https://leetcode-cn.com/problems/utf-8-validation/
 * Description：
 */
public class Problem393 {
    static class Solution {
        static final int MASK1 = 1 << 7;
        static final int MASK2 = (1 << 7) + (1 << 6);

        public boolean validUtf8(int[] data) {
            int m = data.length;
            int index = 0;
            while (index < m) {
                int num = data[index];
                int n = getBytes(num);
                if (n < 0 || index + n > m) {
                    return false;
                }
                for (int i = 1; i < n; i++) {
                    if (!isValid(data[index + i])) {
                        return false;
                    }
                }
                index += n;
            }
            return true;
        }

        public int getBytes(int num) {
            if ((num & MASK1) == 0) {
                return 1;
            }
            int n = 0;
            int mask = MASK1;
            while ((num & mask) != 0) {
                n++;
                if (n > 4) {
                    return -1;
                }
                mask >>= 1;
            }
            return n >= 2 ? n : -1;
        }

        //判断是否以10开头
        public boolean isValid(int num) {
            return (num & MASK2) == MASK1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.validUtf8(new int[]{235, 140, 4}));
    }
}
