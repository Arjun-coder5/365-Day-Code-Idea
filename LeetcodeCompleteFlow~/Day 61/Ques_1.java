class Ques_1 {
  public static void main(String[] args) {
    
  }
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int swaps = 0;
        for(int i = 0; i < n; i++) {
            
            int required = n - i - 1;
            int row = i;
            
            // find suitable row
            while(row < n && countTrailingZeros(grid[row]) < required) {
                row++;
            }

            if(row == n) return -1;
            // bring row up step by step
            while(row > i) {
                int[] temp = grid[row];
                grid[row] = grid[row-1];
                grid[row-1] = temp;

                row--;
                swaps++;
            }
        }

        return swaps;
    }

    private int countTrailingZeros(int[] row) {
        int count = 0;
        for(int i = row.length - 1; i >= 0; i--) {
            if(row[i] == 0) count++;
            else break;
        }
        return count;
    }
}