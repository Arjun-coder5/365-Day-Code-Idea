import java.util.Arrays;

class Ques_3 {
  public static void main(String[] args) {
    
  }
    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = Integer.bitCount(arr[i]);
            arr[i] += count * 10001;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 10001;
        } 
        return arr;
    }
}
