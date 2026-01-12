import java.util.Scanner;

public class Count_ones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int low = 0, high = n - 1;
        int firstOne = -1;

        // Binary Search
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == 1) {
                firstOne = mid;
                high = mid - 1;   // search left
            } else {
                low = mid + 1;    // search right
            }
        }

        int count;
        if (firstOne == -1) {
            count = 0;
        } else {
            count = n - firstOne;
        }

        System.out.println(count);

        sc.close();
    }
}
