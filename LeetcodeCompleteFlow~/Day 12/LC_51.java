import java.util.*;
public class LC_51{
  public static void main(String[] args) {
      // N QUEENS :
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the no of queens : ");
      int n = sc.nextInt();
      List<List<String>> solutions = solveNqueen(n);
      if(solutions.isEmpty()){
        System.out.println("No solution exist for "+ n );
      }else{
      System.out.println("Total Solutions : ");
      for(List<String> boards : solutions){
        for(String row : boards){
          System.out.println(row);
        }
        System.out.println();
      }
      }
  }
  public static List<List<String>>  solveNqueen(int n){
     List<List<String>> res = new ArrayList<>();
     char[][] board = new char[n][n];
     for(int i = 0;i<n;i++){
      Arrays.fill(board[i],'.');
     }
     backtrack(board, 0, res);
     return res;
  }
   public static void backtrack(char[][] board,int row,List<List<String>> res){
     int n = board.length;
     if(row==n){
      res.add(construct(board));
      return;
     }
     for(int col = 0;col<n;col++){
        if(isSafe(board,row,col)){
          board[row][col] = 'Q';
          backtrack(board, row+1, res);
          board[row][col] = '.';
        }
     }
   }
   public static boolean isSafe(char[][] board,int row , int col){
    for(int i = 0;i<row;i++){
      if(board[i][col] == 'Q'){
        return false;
      }
    }
    for (int i = row-1,j = col-1;i>=0&&j>=0;i--,j--) {
        if(board[i][j]=='Q'){
          return false;
        }
    }
    for (int i = row-1,j = col+1;i>=0&&j<board.length;i--,j++) {
        if(board[i][j]=='Q'){
          return false;
        }
    }

    return true;
   }
   public static List<String> construct(char[][] board){
    List<String> res = new ArrayList<>();
    for(char[] row : board ){
       res.add(new String(row));
    }
   return res;
   }
}