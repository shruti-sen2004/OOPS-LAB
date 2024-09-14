import java.util.Scanner;

class TicTacToe {
    private char[] board;
    private char currentPlayer;
    private boolean gameEnded;

    public TicTacToe() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameEnded = false;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (!gameEnded) {
            drawGrid();
            System.out.println("Player " + currentPlayer + ", enter a number (1-9) to place your mark:");
            int position = scanner.nextInt() - 1;
            if (isValidMove(position)) {
                makeMove(position);
                if (checkWin()) {
                    drawGrid();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameEnded = true;
                } else if (isBoardFull()) {
                    drawGrid();
                    System.out.println("It's a draw!");
                    gameEnded = true;
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
        scanner.close();
    }

    public void drawGrid() {
        System.out.println("       |       |       ");    
        System.out.println("   " + board[0] + "   |   " + board[1] + "   |   " + board[2] + "   ");    
        System.out.println("       |       |       ");    
        System.out.println("-----------------------");
        System.out.println("       |       |       ");    
        System.out.println("   " + board[3] + "   |   " + board[4] + "   |   " + board[5] + "   ");    
        System.out.println("       |       |       ");    
        System.out.println("-----------------------");
        System.out.println("       |       |       ");    
        System.out.println("   " + board[6] + "   |   " + board[7] + "   |   " + board[8] + "   ");    
        System.out.println("       |       |       "); 
    }

    private boolean isValidMove(int position) {
        return position >= 0 && position < 9 && board[position] != 'X' && board[position] != 'O';
    }

    private void makeMove(int position) {
        board[position] = currentPlayer;
    }

    private boolean checkWin() {
        // Check rows, columns, and diagonals
        return (board[0] == board[1] && board[1] == board[2]) ||
               (board[3] == board[4] && board[4] == board[5]) ||
               (board[6] == board[7] && board[7] == board[8]) ||
               (board[0] == board[3] && board[3] == board[6]) ||
               (board[1] == board[4] && board[4] == board[7]) ||
               (board[2] == board[5] && board[5] == board[8]) ||
               (board[0] == board[4] && board[4] == board[8]) ||
               (board[2] == board[4] && board[4] == board[6]);
    }

    private boolean isBoardFull() {
        for (char c : board) {
            if (c != 'X' && c != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}