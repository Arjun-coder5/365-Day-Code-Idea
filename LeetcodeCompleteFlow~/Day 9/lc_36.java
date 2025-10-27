import java.util.HashSet;
import java.util.Set;

public class lc_36{
  public static void main(String[]args){
    //  Valid Sudoku :
  //   ✅ Idea:

  //  We will go through each cell (r, c):

  //  If the cell is empty ('.'), skip it.

  // Otherwise:

  //  Check if the number already exists in:

  //  row[r]

  //  column[c]

  //  box[(r//3, c//3)] (this identifies which 3x3 box we’re in)

  // If we ever find a duplicate → return false.
  //  If we finish checking all cells → return true.
   char[][] board = {
    {'5','3','.','.','7','.','.','.','.'},
    {'6','.','.','1','9','5','.','.','.'},
    {'.','9','8','.','.','.','.','6','.'},
    {'8','.','.','.','6','.','.','.','3'},
    {'4','.','.','8','.','3','.','.','1'},
    {'7','.','.','.','2','.','.','.','6'},
    {'.','6','.','.','.','.','2','8','.'},
    {'.','.','.','4','1','9','.','.','5'},
    {'.','.','.','.','8','.','.','7','9'}
   };
   System.out.println(isValidSudoku(board));
  }
  public static   boolean isValidSudoku(char[][]board){
    Set<String> seen = new HashSet<>();
    for(int i= 0;i<9;i++){
      for(int j = 0;j<9;j++){
        char num = board[i][j];
        if(num=='.')continue;
        if(!seen.add(num+" in row "+i)||
           !seen.add(num+" in column "+j)||
           !seen.add(num+" in box "+(i/3)+"-"+(j/3))){
          return false;
        }
      }
    }
    return true;
  }
}