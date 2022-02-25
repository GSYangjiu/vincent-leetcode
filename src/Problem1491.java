import java.util.Arrays;

/**
 * @author Vincent
 * @date 2022/2/26 12:05 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 去掉最低工资和最高工资后的工资平均值
 * URL: https://leetcode-cn.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
 * Description：注意不要直接return int
 */
public class Problem1491 {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int sum = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
        }
        return (double) sum / (salary.length - 2);
    }
}
