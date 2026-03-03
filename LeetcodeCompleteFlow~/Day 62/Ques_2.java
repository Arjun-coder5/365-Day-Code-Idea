import java.util.Arrays;

public class Ques_2 {
  public static void main(String[] args) {
    
  }
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
      return Arrays.equals(target,arr);
    }
}

