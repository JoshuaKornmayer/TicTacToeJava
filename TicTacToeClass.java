import java.util.Scanner;

public class TicTacToeClass {
    // Instance Variables
    private char[][] board;
    private int turns;
    private boolean isWinner;
    private boolean isFull;
    private boolean isCat;

    // Constructors
    public TicTacToeClass() {
        board = new char[3][3];
        turns = 0;

        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    // Accessor Methods

    public boolean isWinner(char p) {
        if (p == board[0][0] && board[0][0] == board[0][1] && board[0][1] == board[0][2]) {
            isWinner = true;
        } else if (p == board[1][0] && board[1][0] == board[1][1] && board[1][1] == board[1][2]) {
            isWinner = true;
        } else if (p == board[2][0] && board[2][0] == board[2][1] && board[2][1] == board[2][2]) {
            isWinner = true;
        } else if (p == board[0][0] && board[0][0] == board[1][0] && board[1][0] == board[2][0]) {
            isWinner = true;
        } else if (p == board[0][1] && board[0][1] == board[1][1] && board[1][1] == board[2][1]) {
            isWinner = true;
        } else if (p == board[0][2] && board[0][2] == board[1][2] && board[1][2] == board[2][2]) {
            isWinner = true;
        } else if (p == board[0][0] && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            isWinner = true;
        } else if (p == board[0][2] && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            isWinner = true;
        } else {
            isWinner = false;
        }

        return isWinner;

    }

    public boolean isFull() {
        if (turns < 9) {
            isFull = false;
        } else {
            isFull = true;
        }
        return isFull;
    }

    public boolean isCat() {
        if (isFull && isWinner == false) {
            isCat = true;
        } else {
            isCat = false;
        }
        return isCat;
    }

    public boolean isValid(int r, int c) {
        if (0 <= r && r <= 2 && 0 <= c && c <= 2)
            return true;
        else
            return false;
    }

    public int numTurns() {
        return turns;
    }

    public char playerAt(int r, int c) {
        if (isValid(r, c))
            return board[r][c];
        else
            return '@';
    }

    public void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    // Modifiers
    public void playMove(char p, int r, int c) {
        if (board[r][c] != 'X' && board[r][c] != 'O') {
            board[r][c] = p;
        }

        /*
         * switch (r) { case 1: board[0][0] = 'X'; break; case 2: board[0][1] = 'X';
         * break; case 3: board[0][2] = 'X'; break; case 4: board[1][0] = 'X'; break;
         * case 5: board[1][1] = 'X'; break; case 6: board[1][2] = 'X'; break; case 7:
         * board[2][0] = 'X'; break; case 8: board[2][1] = 'X'; break; case 9:
         * board[2][2] = 'X'; break; default: break; }
         */
        turns++;
    }

}
