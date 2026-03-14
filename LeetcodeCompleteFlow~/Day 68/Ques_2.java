class Ques_2 {
  public static void main(String[] args) {
    
  }
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;
        StringBuilder sb = new StringBuilder();
        while(n>0){
            int ans = n%2;
            sb.append(ans);
            n /= 2;
        }
        String result = sb.reverse().toString();
       StringBuilder complement = new StringBuilder();
        for(int i = 0;i<result.length();i++){
            if(result.charAt(i)=='1'){
               complement.append('0');
            }else if(result.charAt(i)=='0'){
               complement.append('1');
            }
        }
        return Integer.parseInt(complement.toString(),2);
    }
}