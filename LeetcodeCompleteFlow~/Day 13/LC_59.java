import java.util.*;
public class LC_59 {
    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1, num = 1;
        while (num <= n * n) {
            for (int i = left; i <= right; i++) res[top][i] = num++;
            top++;
            for (int i = top; i <= bottom; i++) res[i][right] = num++;
            right--;
            for (int i = right; i >= left; i--) res[bottom][i] = num++;
            bottom--;
            for (int i = bottom; i >= top; i--) res[i][left] = num++;
            left++;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 3;
        int[][] ans = generateMatrix(n);
        for (int[] a : ans) System.out.println(Arrays.toString(a));
    }
}
