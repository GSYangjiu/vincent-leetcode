import java.util.Arrays;

/**
 * @author Vincent
 * @date 2022/3/9 5:06 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 得分最高的最小轮调
 * URL: https://leetcode-cn.com/problems/smallest-rotation-with-highest-score/
 * Description：差分数组，妙
 */
public class Problem798 {

    //时间复杂度n方，超出时间限制
    static class Solution {
        public int bestRotation(int[] nums) {
            int[] diff = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                diff[i] = nums[i] - i;
            }
            int max = 0, k = 0;
            for (int i = 0; i < nums.length; i++) {
                int count = 0;
                int[] temp = Arrays.copyOf(diff, diff.length);
                for (int j = 0; j < diff.length; j++) {
                    if (i != 0) {
                        if (j >= i) {
                            temp[j] = diff[j] + i;
                        } else {
                            temp[j] = diff[j] - nums.length + i;
                        }
                    }
                    if (temp[j] <= 0) {
                        count += 1;
                    }
                }
                if (count > max) {
                    max = count;
                    k = i;
                }
            }
            return k;
        }
    }

    class Solution1 {
        public int beastRotation(int[] nums) {
            int n = nums.length;
            int[] move = new int[n];

            //差分数组
            //遍历数组一遍，得出每个数move的得分变动情况，不用计算具体得分
            //每个具体的数得分情况变动的位置是固定的，按照初始位置是否得分分为两种情况
            for (int i = 0; i < n; i++) {
                if (nums[i] <= i) {
                    // nums[i] 一开始所在位置就可以得分
                    move[0]++; // 不移动时 nums[i]就产生贡献
                    move[(i - nums[i] + 1) % n]--; // 左移 i - nums[i] + 1 则差首次为正； 贡献取消； 继续左移也不会产生新贡献
                    move[(i + 1) % n]++; // 直到移动到坐标小于0的位置； 变成移动到最右边； 贡献产生
                } else {
                    // 一开始所在位置不可得分；左移是没有用的；只有移动到边界时，才会产生变化
                    move[(i + 1) % n]++;
                    // 继续左移动；则会再次到达 值和下标相同的临界点； 继续左移一位则得分取消
                    move[(n - (nums[i] - i) + 1) % n]--;
                }
            }

            int score = 0;
            int maxS = 0;
            int best = 0;

            for (int m = 0; m < n; m++) {
                score += move[m];
                if (score > maxS) {
                    maxS = score;
                    best = m;
                }
            }

            return best;
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.bestRotation(new int[]{2, 3, 1, 4, 0}));
    }
}
