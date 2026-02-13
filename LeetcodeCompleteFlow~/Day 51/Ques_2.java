import java.util.*;

public class Ques_2 {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] res = new int[rows * cols][2];
        int k = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[k][0] = i;
                res[k][1] = j;
                k++;
            }
        }

        Arrays.sort(res, (a, b) -> {
            int d1 = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int d2 = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
            return d1 - d2;
        });

        return res;y
    }

    public static void main(String[] args) {
        Ques_2 s = new Ques_2();
        int[][] ans = s.allCellsDistOrder(2, 3, 1, 2);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i][0] + " " + ans[i][1]);
        }
    }
}
