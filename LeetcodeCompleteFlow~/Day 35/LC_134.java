import java.util.*;

public class LC_134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] gas = new int[n];
        int[] cost = new int[n];

        for (int i = 0; i < n; i++) gas[i] = sc.nextInt();
        for (int i = 0; i < n; i++) cost[i] = sc.nextInt();

        Solution sol = new Solution();
        int ans = sol.canCompleteCircuit(gas, cost);

        System.out.println(ans);
    }
}

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = 0;
        int totalcost = 0;

        for (int g : gas) totalgas += g;
        for (int c : cost) totalcost += c;

        if (totalcost > totalgas) return -1;

        int tank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            tank += gas[i] - cost[i];
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        return start;
    }
}
