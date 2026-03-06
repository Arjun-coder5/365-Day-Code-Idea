class Ques_1 {
  public static void main (String[]args){
    
  }
    public boolean checkOnesSegment(String s) {
      
        for (int i = 1; i < s.length(); i++) {
          
            if (s.charAt(i) == '1' && s.charAt(i - 1) == '0') {
                return false; 
            }
        }
        return true;
    }
}
