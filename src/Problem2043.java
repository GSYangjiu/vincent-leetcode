/**
 * @author Vincent
 * @date 2022/3/18 11:00 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 简易银行系统
 * URL: https://leetcode-cn.com/problems/simple-bank-system/
 * Description：
 */
public class Problem2043 {
    class Bank {

        long[] balance;

        public Bank(long[] balance) {
            this.balance = balance;
        }

        public boolean transfer(int account1, int account2, long money) {
            if (!withdraw(account1, money)) {
                return false;
            }
            if (!deposit(account2, money)) {
                deposit(account1, money);
                return false;
            }
            return true;
        }

        public boolean deposit(int account, long money) {
            if (account <= 0 || account > balance.length) {
                return false;
            }
            balance[account - 1] += money;
            return true;
        }

        public boolean withdraw(int account, long money) {
            if (account <= 0 || account > balance.length || balance[account - 1] < money) {
                return false;
            }
            balance[account - 1] -= money;
            return true;
        }
    }
}
