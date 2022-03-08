/**
 * @author Vincent
 * @date 2022/3/8 11:20 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 设计停车系统
 * URL: https://leetcode-cn.com/problems/design-parking-system/submissions/
 * Description：
 */
public class Problem1603 {
    class ParkingSystem {

        public int[][] park;

        public ParkingSystem(int big, int medium, int small) {
            this.park = new int[3][2];
            this.park[0][0] = big;
            this.park[1][0] = medium;
            this.park[2][0] = small;
        }

        public boolean addCar(int carType) {
            if (carType > 3 || carType < 1) {
                return false;
            }
            if (park[carType - 1][1] >= park[carType - 1][0]) {
                return false;
            }
            park[carType - 1][1] += 1;
            return true;
        }
    }
}
