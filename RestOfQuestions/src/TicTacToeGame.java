import java.util.*;

public class TicTacToeGame {
	private char[][] board;
	private char turn;
	private char winner;

	public TicTacToeGame() {
		board = new char[3][3];
		turn = 'x';
		winner = 0;
	}

	public boolean move(int row, int column) {
		if (row < 0 || row > 2 || column < 0 || column > 2)
			return false;
		if (winner != 0 || board[row][column] != 0) {
			return false;
		}
		board[row][column] = turn;
		if (turn == 'x')
			turn = 'o';
		else if (turn == 'o')
			turn = 'x';
		setWinner();
		return true;

	}

	// sets the winner variable to the winner, if there is one.
	private void setWinner() {
		// check rows and columns
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
				winner = board[i][0];
			}
			if (board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
				winner = board[0][i];
			}
		}
		// check the 2 diagonals
		if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
			winner = board[0][0];
		}
		if (board[2][0] == board[1][1] && board[2][0] == board[0][2]) {
			winner = board[2][0];
		}
	}

	public char getWinner() {
		return this.winner;
	}

	public String toString() {
		String s = "";
		for (int row = 0; row < 3; row++) {
			s += String.format("%c|%c|%c", board[row][0], board[row][1], board[row][2]);
			s += "\n------\n";
		}
		return s;
	}

	public char getTurn() {
		return this.turn;
	}

	public static void main(String[] args) {
		TicTacToeGame game = new TicTacToeGame();
		System.out.println("Starting new Tic-Tac-Toe game");
		Scanner sc = new Scanner(System.in);
		while (game.getWinner() == 0) {
			System.out.println("The board is currently:\n" + game);
			System.out.println("Enter two integers for " + game.getTurn() + "'s move:");
			int row = sc.nextInt();
			int column = sc.nextInt();
			game.move(row, column);
		}
		sc.close();
		System.out.println(game.getWinner() + " WINS!!");
	}
}