class Ques_1 {
  public static void main(String[] args) {
    
  }
    public int binaryGap(int n){
        String bs = Integer.toBinaryString(n);
        int mxLen = 0;
        int lstIdx = -1;
        for(int i = 0;i<bs.length();i++){
              if(bs.charAt(i)=='1'){
                if(lstIdx!=-1){
                    int len = i-lstIdx;
            mxLen = Math.max(mxLen, i - lstIdx );

                }
                  lstIdx = i;
              }
            
        }
        return mxLen;
    }
}