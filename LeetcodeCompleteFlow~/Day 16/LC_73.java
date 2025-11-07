import java.util.*;

public class LC_73 {
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean fr = false, fc = false;

        for (int i = 0; i < m; i++) if (matrix[i][0] == 0) fc = true;
        for (int j = 0; j < n; j++) if (matrix[0][j] == 0) fr = true;

        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (matrix[i][j] == 0) matrix[i][0] = matrix[0][j] = 0;

        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;

        if (fr) for (int j = 0; j < n; j++) matrix[0][j] = 0;
        if (fc) for (int i = 0; i < m; i++) matrix[i][0] = 0;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(mat);
        for (int[] row : mat) System.out.println(Arrays.toString(row));
    }
}
