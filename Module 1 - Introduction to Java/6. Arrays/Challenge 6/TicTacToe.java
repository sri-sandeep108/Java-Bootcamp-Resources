import java.util.Scanner;

public class TicTacToe {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("\nLet's play tic tac toe");

    char[][] board = { { '_', '_', '_' }, { '_', '_', '_' }, { '_', '_', '_' } };

    printBoard(board);
    int[] spot = new int[2];
    for (int i = 0; i < 9; i++) {
      if (i % 2 == 0) {
        System.out.println("Turn: X \n");
        spot = askUser(board);
        board[spot[0]][spot[1]] = 'X';
      } else {
        System.out.println("Turn: O \n");
        spot = askUser(board);
        board[spot[0]][spot[1]] = 'O';
      }
      printBoard(board);
      int result = checkWin(board);
      if (result == 3) {
        System.out.println("\nX Wins! \n Exiting...");
        System.exit(0);
      } else if (result == -3) {
        System.out.println("\nO Wins! \n Exiting...");
        System.exit(0);
      }
    }
    System.out.println("It's a Tie");

    scan.close();
  }

  public static void printBoard(char[][] board) {
    for (int i = 0; i < 3; i++) {
      System.out.print("\n\t");
      for (int j = 0; j < 3; j++) {
        System.out.print(board[i][j] + "  ");
      }
      System.out.println();
    }
    System.out.println();
  }

  public static int[] askUser(char[][] board) {
    while (true) {
      System.out.print("Pick the row and column: ");
      int i = scan.nextInt();
      int j = scan.nextInt();
      if (board[i][j] == '_') {
        int[] spot = { i, j };
        return spot;
      }
      System.out.println("Invalid choice! \n");
      printBoard(board);

    }
  }

  public static int checkWin(char[][] board) {
    int count = 0;
    for (int i = 0; i < board.length; i++) {
      count = 0;
      for (int j = 0; j < board[i].length; j++) {
        if (board[i][j] == 'X') {
          count += 1;
        } else if (board[i][j] == 'O') {
          count -= 1;
        }
      }
      if (count == 3 || count == -3) {
        return count;
      }
    } // Checks Every Row
    for (int i = 0; i < board.length; i++) {
      count = 0;
      for (int j = 0; j < board[i].length; j++) {
        if (board[j][i] == 'X') {
          count += 1;
        } else if (board[j][i] == 'O') {
          count -= 1;
        }
      }
      if (count == 3 || count == -3) {
        return count;
      }
    } // Checks Every Column
    count = 0;
    for (int i = 0; i < board.length; i++) {
      if (board[i][i] == 'X') {
        count += 1;
      } else if (board[i][i] == 'O') {
        count -= 1;
      }
      if (count == 3 || count == -3) {
        return count;
      }
    } // Check Left Diagonal
    count = 0;
    int j = 0;
    for (int i = (board.length - 1); i >= 0; i--) {
      if (board[i][j] == 'X') {
        count += 1;
      } else if (board[i][j] == 'O') {
        count -= 1;
      }
      if (count == 3 || count == -3) {
        return count;
      } // Check Right Diagonal
      j++;
    }
    return 0;
  }
}