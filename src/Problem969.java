import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/2/19 11:00 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 煎饼排序
 * URL: https://leetcode-cn.com/problems/pancake-sorting/
 * Description：1.遍历找最大值
 * 2.翻转两次，第一次到arr[0],第二次到arr[arr.length-1];
 */
public class Problem969 {

    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> res = new ArrayList<>();
        int length = arr.length;
        //i = length-1:最后一次只剩最小值位于index=0,不需要处理
        for (int i = 0; i < length - 1; i++) {
            int index = 0;
            for (int j = 0; j < length - i; j++) {
                if (arr[j] > arr[index]) {
                    index = j;
                }
            }
            //当最大值在数组中index = 0 时，只需要一次翻转
            if (index != 0) {
                reverseArr(arr, index);
                res.add(index + 1);
            }
            reverseArr(arr, arr.length - 1 - i);
            res.add(arr.length - i);
        }
        return res;
    }

    //翻转数组
    public void reverseArr(int[] arr, int index) {
        int l = 0, r = index;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        Problem969 problem969 = new Problem969();
        System.out.println(problem969.pancakeSort(new int[]{3, 2, 4, 1}));
    }
}
