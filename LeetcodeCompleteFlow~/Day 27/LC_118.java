import java.util.*;

public class LC_118 {

    // ✅ Pascal’s Triangle generate karne ka function
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                // First aur last element hamesha 1
                if (j == 0 || j == i) {
                    row.add(1);
                } 
                // Beech ke elements = upar ke do ka sum
                else {
                    row.add(res.get(i - 1).get(j - 1) + 
                            res.get(i - 1).get(j));
                }
            }

            res.add(row);
        }

        return res;
    }

    // ✅ MAIN METHOD (Run karne ke liye)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int numRows = sc.nextInt();

        List<List<Integer>> triangle = generate(numRows);

        // ✅ Print Pascal’s Triangle
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
