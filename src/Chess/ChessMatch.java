package Chess;

import Chess.pieces.King;
import Chess.pieces.Rook;
import boardgame.Board;
import boardgame.Position;

public class ChessMatch {

	private static Board board;
	
	public ChessMatch () {
		board = new Board(8,8);
		initialSetup();
	}
	
	public static ChessPiece[][] getpieces(){// este metodo vai retornar uma matriz de peça de xadrez correspon de a partida 
	    ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j);
			}
		}
		return mat;
	}

	private void initialSetup() {
		board.placePiece(new Rook(board, Color.White), new Position(2,1));
		board.placePiece(new King(board, Color.Black), new Position(0,4));
	}

	
}
