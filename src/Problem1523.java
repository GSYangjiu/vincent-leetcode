/**
 * @author Vincent
 * @date 2022/2/25 11:39 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 在区间范围内统计奇数数目
 * URL: https://leetcode-cn.com/problems/count-odd-numbers-in-an-interval-range/
 * Description：
 */
public class Problem1523 {
    public int countOdds(int low, int high) {
        if(low % 2 == 1){
            --low;
        }
        if(high % 2 == 1){
            ++high;
        }
        return (high - low) / 2;
    }
}
