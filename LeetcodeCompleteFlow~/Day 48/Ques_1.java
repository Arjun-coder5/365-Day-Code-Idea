import java.util.Arrays;

public class Ques_1 {

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2; i--) {
            int a = nums[i - 2];
            int b = nums[i - 1];
            int c = nums[i];

            if (a + b > c) {
                return a + b + c;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Ques_1 sol = new Ques_1();

        int[] nums1 = {1, 2, 1, 10};
        System.out.println(sol.largestPerimeter(nums1)); 

        int[] nums2 = {2, 1, 2};
        System.out.println(sol.largestPerimeter(nums2));
    }
}