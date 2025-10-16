public class LC_28 {
  public int strStr(String haystack, String needle) {
    if (needle.isEmpty()) return 0;
    int n = haystack.length(), m = needle.length();
    for (int i = 0; i <= n - m; i++) {
      if (haystack.substring(i, i + m).equals(needle)) {
        return i;
      }
    }
    return -1;
  }


  public static void main(String[] args) {
    LC_28 solution = new LC_28();
    System.out.println(solution.strStr("hello", "ll")); // Output: 2
    System.out.println(solution.strStr("aaaaa", "bba")); // Output: -1
  }
}