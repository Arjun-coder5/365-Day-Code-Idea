import java.util.Arrays;

public class Ques_1 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        
        int[] alice1 = {1, 1};
        int[] bob1 = {2, 2};
        int[] result1 = sol.fairCandySwap(alice1, bob1);
        
       
        System.out.println("Input: Alice=[1,1], Bob=[2,2]");
        System.out.println("Output: " + Arrays.toString(result1)); 
    }
}

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;

        
        for (int i = 0; i < aliceSizes.length; i++) {
            sumA += aliceSizes[i];
        }

       
        for (int j = 0; j < bobSizes.length; j++) {
            sumB += bobSizes[j];
        }

       
        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                
                if (sumA - aliceSizes[i] + bobSizes[j] == sumB - bobSizes[j] + aliceSizes[i]) {
                    return new int[]{aliceSizes[i], bobSizes[j]};
                }
            }
        }
        return new int[]{-1, -1};
    }
}