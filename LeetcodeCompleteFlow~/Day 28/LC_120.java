import java.util.*;

public class LC_120 {
    static int[][] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i = 0; i < n; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                row.add(sc.nextInt());
            }
            triangle.add(row);
        }
        memo = new int[n][n];
        for(int[] r : memo) Arrays.fill(r, Integer.MAX_VALUE);
        System.out.println(dfs(0, 0, triangle));
    }

    public static int dfs(int r, int c, List<List<Integer>> t) {
        if(r == t.size() - 1) return t.get(r).get(c);
        if(memo[r][c] != Integer.MAX_VALUE) return memo[r][c];
        int down = dfs(r + 1, c, t);
        int diag = dfs(r + 1, c + 1, t);
        return memo[r][c] = t.get(r).get(c) + Math.min(down, diag);
    }
}
