/**
 * @author Vincent
 * @date 2022/3/27 4:46 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 柠檬水找零
 * URL: https://leetcode-cn.com/problems/lemonade-change/
 * Description：
 */
public class Problem860 {
    class Solution {
        public boolean lemonadeChange(int[] bills) {
            int[] change = new int[2];
            for (int i = 0; i < bills.length; i++) {
                switch (bills[i]) {
                    case 5:
                        change[0]++;
                        break;
                    case 10:
                        if (change[0] == 0) {
                            return false;
                        }
                        change[0]--;
                        change[1]++;
                        break;
                    case 20:
                        if (change[0] >= 1 && change[1] >= 1) {
                            change[0]--;
                            change[1]--;
                        } else if (change[0] >= 3) {
                            change[0] -= 3;
                        } else {
                            return false;
                        }
                    default:
                        break;
                }
            }
            return true;
        }
    }
}
