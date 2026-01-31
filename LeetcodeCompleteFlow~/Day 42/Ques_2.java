import java.util.*;

public class Ques_2 {

    public static int thirdMax(int[] nums) {

        Arrays.sort(nums);

        int count = 1;
        int last = nums[nums.length - 1];

   
        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] != last) {
                count++;
                last = nums[i];
            }

            if (count == 3)
                return nums[i];
        }

        // if less than 3 distinct → return max
        return nums[nums.length - 1];
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = thirdMax(arr);

        System.out.println("Third Maximum = " + ans);

        sc.close();
    }
}
