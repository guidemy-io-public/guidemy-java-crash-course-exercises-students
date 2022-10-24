package java_module.java_basics.question;

import java.util.Arrays;

public class RunOfThree {
    /*
        For the purpose of visualization only
     */
    public static void main(String[] args) {
        char[][] board = {
                {'o', 'x', 'o'},
                {'-', 'x', '-'},
                {'o', 'x', 'o'}
        };
        int[][] winningPiecesCoordinates = findWinningPiecesCoordinates(board);
        displayWinningPiecesFromBoard(winningPiecesCoordinates, board);
    }

    /*

        Complete this method to find the coordinates of the winning pieces
        from the board of a Tic Tac Toe game.

        For example, with a board like this:

        char[][] board = {
                {'o', 'x', 'o'},
                {'-', 'x', '-'},
                {'o', 'x', 'o'}
        };

        The coordinates of the winning pieces should be:

        int[][] winningPiecesCoordinates = new int[][]{
                {0, 1},
                {1, 1},
                {2, 1},
        };

        You can assume there will always be three winning pieces only.

        Note: Run the test cases from RunOfThreeTest.java to validate your code.

    */
    public static int[][] findWinningPiecesCoordinates(char[][] board) {
        // TODO: complete this method

        return new int[0][0];
    }

    /*

        Do not modify this method.

        This method only prints out the winning pieces on a game board.

        For example, with a board like this:

        char[][] board = {
                {'o', 'x', 'o'},
                {'-', 'x', '-'},
                {'o', 'x', 'o'}
        };

        This method will generate the following output:

        |   | x |   |
        |   | x |   |
        |   | x |   |

     */
    public static void displayWinningPiecesFromBoard(int[][] winningPiecesCoordinates,
                                                     char[][] board) {
        for (int row = 0; row < board.length; row++) {
            System.out.print("| ");
            for (int col = 0; col < board[row].length; col++) {
                int[] pieceCoordinates = {row, col};
                if (isWinningPiece(pieceCoordinates, winningPiecesCoordinates)) {
                    System.out.print(board[row][col]);
                    System.out.print(" | ");
                    continue;
                }
                System.out.print(" ");
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    /*

        Do not modify this method.

        This method checks whether a piece is a winning piece.

     */
    private static boolean isWinningPiece(int[] pieceCoordinates,
                                          int[][] winningPiecesCoordinates) {
        for (int[] winningPiece : winningPiecesCoordinates) {
            if (Arrays.equals(pieceCoordinates, winningPiece)) {
                return true;
            }
        }
        return false;
    }
}
