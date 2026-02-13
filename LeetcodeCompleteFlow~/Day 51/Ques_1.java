import java.util.*;

public class Ques_1 {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] exp = new int[n];

        for(int i = 0; i < n; i++){
            exp[i] = heights[i];
        }

        Arrays.sort(exp);

        int cntIndx = 0;

        for(int j = 0; j < n; j++){
            if(exp[j] != heights[j]){
                cntIndx++;
            }
        }

        return cntIndx;
    }

    public static void main(String[] args) {
        Ques_1 sol = new Ques_1();
        int[] heights = {1,1,4,2,1,3};
        int result = sol.heightChecker(heights);
        System.out.println(result);
    }
}
