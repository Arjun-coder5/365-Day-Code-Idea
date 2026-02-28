class Ques_1 {
  public static void main(String[]args){
  }
    public int concatenatedBinary(int n) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i <= n; i++){
            sb.append(Integer.toBinaryString(i));
        }
        
        long result = 0;
        int mod = 1000000007;
        
        for(int i = 0; i < sb.length(); i++){
            result = (result * 2 + (sb.charAt(i) - '0')) % mod;
        }
        
        return (int) result;
    }
  }
