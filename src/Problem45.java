/**
 * @author Vincent
 * @date 2022/5/23 6:19 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 跳跃游戏II
 * URL: https://leetcode.cn/problems/jump-game-ii/
 * Description：
 */
public class Problem45 {
    class Solution {
        //贪心算法，从后往前求解，每次找最大位置，步数+1；
        public int jump(int[] nums) {
            int position = nums.length - 1;
            int steps = 0;
            while (position > 0) {
                for (int i = 0; i < position; i++) {
                    if (i + nums[i] >= position) {
                        steps += 1;
                        position = i;
                    }
                }
            }
            return steps;
        }
    }

    class Solution1 {
        public int jump(int[] nums) {
            //从前往后，每次计算可到达的最远位置，如果到end之前有位置大于最远位置，更新最远位置
            int maxPosition = 0;
            int end = 0;
            int steps = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                maxPosition = Math.max(maxPosition, i + nums[i]);
                if (i == end) {
                    end = maxPosition;
                    steps += 1;
                }
            }
            return steps;
        }
    }
}
