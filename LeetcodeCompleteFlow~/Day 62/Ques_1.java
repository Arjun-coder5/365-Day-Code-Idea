class Ques_1 {
  public static void main(String[] args) {
      
  }
    public char findKthBit(int n, int k) {
        
        String s = "0";
        
        for(int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            
            // invert
            for(char c : s.toCharArray()) {
                if(c == '0') sb.append('1');
                else sb.append('0');
            }
            
            // reverse
            sb.reverse();
            
            // build new string
            s = s + "1" + sb.toString();
        }
        
        return s.charAt(k - 1);
    }
}