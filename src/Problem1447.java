import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/2/10 10:13 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 最简分数
 * URL: https://leetcode-cn.com/problems/simplified-fractions/
 * Description：gcd
 */
public class Problem1447 {

    public List<String> simplifiedFractions(int n) {
        List<String> res = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (gcd(j, i) == 1) {
                    res.add(j + "/" + i);
                }
            }
        }
        return res;
    }

    /**
     * @param a
     * @param b
     * @return 最大公约数
     * 欧几里得算法：a可以表示成a = kb + r（a，b，k，r皆为正整数，且r
     * 假设d是a,b的一个公约数，记作d|a,d|b，即a和b都可以被d整除。
     * 而r = a - kb，两边同时除以d，r/d=a/d-kb/d，由等式右边可知m=r/d为整数，因此d|r
     * 因此d也是b,a mod b的公约数。
     * 因(a,b)和(b,a mod b)的公约数相等，则其最大公约数也相等，得证。
     */
    public int gcd(int a, int b) {
        return b != 0 ? gcd(b, a % b) : a;
    }

    public static void main(String[] args) {
        Problem1447 problem1447 = new Problem1447();
        System.out.println(problem1447.simplifiedFractions(3));
    }
}
