/**
 * @author Vincent
 * @date 2022/1/27 11:27 下午
 * Email: vincent1094259423@yahoo.com
 * Description：https://leetcode-cn.com/problems/palindrome-number/
 */
public class Problem9 {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String[] strs = String.valueOf(x).split("");
        if ("0".equals(strs[strs.length - 1]) && strs.length != 1) {
            return false;
        }
        for (int i = 0; i < strs.length / 2; i++) {
            if (!strs[i].equals(strs[strs.length - i - 1])) {
                return false;
            }
        }
        return true;
    }

    //revertedNumber * 10 + x % 10 翻转x 避免转换为字符串进行比较
    public boolean isPalindromeFast(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        //条件x>revertedNumber 只用比较一半长度
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
