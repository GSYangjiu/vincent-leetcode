import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/2/5 9:27 下午
 * Email: vincent1094259423@yahoo.com
 * Description：三数之和 https://leetcode-cn.com/problems/3sum/
 */
public class Problem15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return res;
        }
        Arrays.sort(nums);
        //双指针 L = i+1 R = nums.length - 1
        for (int i = 0; i < nums.length; i++) {
            //nums[i] > 0 三数之和一定大于0
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue; // 去重
            int L = i + 1;
            int R = nums.length - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    //继续寻找中间是否有三个数之和等于0
                    while (L < R && nums[L] == nums[L + 1]) L++; // 去重
                    while (L < R && nums[R] == nums[R - 1]) R--; // 去重
                    L++;
                    R--;
                } else if (sum < 0) {
                    L++;
                } else {
                    R--;
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        Problem15 problem15 = new Problem15();
        System.out.println(problem15.threeSum(new int[]{-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4}));
    }
}
