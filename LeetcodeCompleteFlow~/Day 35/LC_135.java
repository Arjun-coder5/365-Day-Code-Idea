import java.util.*;

public class LC_135 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ratings = new int[n];
        for (int i = 0; i < n; i++) {
            ratings[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int result = sol.candy(ratings);

        System.out.println(result);
    }
}

class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candy = new int[n];

        // Step 1: sabko 1 candy
        for (int i = 0; i < n; i++) {
            candy[i] = 1;
        }

        // Step 2: left to right
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            }
        }

        // Step 3: right to left
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candy[i] = Math.max(candy[i], candy[i + 1] + 1);
            }
        }

        // Step 4: sum
        int sum = 0;
        for (int c : candy) sum += c;

        return sum;
    }
}
