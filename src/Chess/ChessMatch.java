package Chess;

import Chess.pieces.Rook;
import boardgame.Board;

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
	
	private void placeNewPiece (char column, int row , ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column , row).toPosition());
	}

	private void initialSetup() {
		placeNewPiece('b' ,6 ,new Rook(board, Color.White));
		placeNewPiece('e' ,8 ,new Rook(board, Color.White));
		placeNewPiece('e' ,1 ,new Rook(board, Color.White));
	}

	
}
