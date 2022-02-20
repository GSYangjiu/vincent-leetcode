/**
 * @author Vincent
 * @date 2022/2/20 9:11 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 1比特与2比特字符
 * URL: https://leetcode-cn.com/problems/1-bit-and-2-bit-characters/
 * Description：
 */
public class Problem717 {
    public boolean isOneBitCharacter(int[] bits) {
        if (bits[bits.length - 1] != 0) {
            return false;
        }
        return is(bits, bits.length - 2);
    }

    public boolean is(int[] bits, int index) {
        if (index > 0) {
            if (bits[index] == 1) {
                return bits[index - 1] == 1 && is(bits, index - 2);
            } else {
                return is(bits, index - 2) || is(bits, index - 1);
            }
        } else if (index == 0) {
            return bits[0] == 0;
        } else {
            return true;
        }
    }
}
