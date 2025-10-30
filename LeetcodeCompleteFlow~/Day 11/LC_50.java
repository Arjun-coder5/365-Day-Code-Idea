public class LC_50 {
  public static void main(String[] args) {
    // Test cases
    System.out.println(myPow(2.0, 10));   // 1024.0
    System.out.println(myPow(2.1, 3));    // 9.261
    System.out.println(myPow(2.0, -2));   // 0.25
    System.out.println(myPow(3.0, 0));    // 1.0
    System.out.println(myPow(5.0, 1));    // 5.0
  }

  public static double myPow(double x, int n) {
    long power = n; // convert to long to handle overflow
    if (power < 0) {
      x = 1 / x;    // reciprocal if exponent is negative
      power = -power;
    }

    double result = 1.0;

    while (power > 0) {
      if (power % 2 == 1) { // if odd
        result *= x;
      }
      x *= x;       // square the base
      power /= 2;   // halve the exponent
    }

    return result;
  }
}
