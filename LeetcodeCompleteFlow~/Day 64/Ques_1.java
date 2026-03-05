class Ques_1 {
  public static void main(String[] args) {
      
  }
    public int minOperations(String s) {
        int n = s.length();
        int count0 = 0;
        for (int i = 0; i < n; i++) {
            char expected = (i % 2 == 0) ? '0' : '1';
            
            if (s.charAt(i) != expected) {
                count0++;
            }
        }
        return Math.min(count0, n - count0);
    }
}
