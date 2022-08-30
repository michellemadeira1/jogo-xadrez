package application;

import Chess.ChessMatch;



public class Program {

	public static void main(String[] args) {

		ChessMatch chessMatch = new ChessMatch();// instanciando
		UI.printBoard(ChessMatch.getpiece());
	}

}
