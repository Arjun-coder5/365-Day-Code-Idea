class Ques_1 {
  public static void main(String[] args) {
    
  }
    public int minPartitions(String n) {
      int md = 0;
      for(int i = 0;i<n.length();i++){
        md = Math.max(md,n.charAt(i)-'0');
      } 
      return md; 
    }
}