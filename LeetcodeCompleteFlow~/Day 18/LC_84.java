import java.util.*;

public class LC_84 {
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= heights.length; i++) {
            int h = (i == heights.length) ? 0 : heights[i];

            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : (i - stack.peek() - 1);
                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of histogram: ");
        int n = sc.nextInt();

        int[] heights = new int[n];
        System.out.println("Enter bar heights:");
        for (int i = 0; i < n; i++) heights[i] = sc.nextInt();

        int result = largestRectangleArea(heights);
        System.out.println("Largest Rectangle Area: " + result);
    }
}
