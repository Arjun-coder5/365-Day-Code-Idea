class Ques_1 {
  public static void main(String[] args) {
                            
  }
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] rowCount = new int[m];
        int[] colCount = new int[n];
        
        // Step 1: Count 1s in each row and column
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }
        
        int specialPositions = 0;
        
        // Step 2: Identify special positions
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If cell is 1 and it's the only 1 in its row and column
                if (mat[i][j] == 1 && rowCount[i] == 1 && colCount[j] == 1) {
                    specialPositions++;
                }
            }
        }
        
        return specialPositions;
    }
}
