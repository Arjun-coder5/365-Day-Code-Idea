import java.util.Scanner;

public class Square_Root {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
        if (x < 0) {
            System.out.println("Square root not defined");
            return;
        }
         int low = 0, high = x;
        int ans = 0;
           while (low <= high) {
            int mid = low + (high - low) / 2;

            long square = (long) mid * mid; // prevent overflow

            if (square == x) {
                ans = mid;
                break;
            } 
            else if (square < x) {
                ans = mid;       // possible answer
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        System.out.println(ans);

//     int i = 1;
//     while((long)i*i<=x){
//       i++;
       
//     }
 

//  System.out.println(i-1);
  }
}
