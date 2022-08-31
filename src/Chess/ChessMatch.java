package Chess;

import Chess.pieces.King;
import Chess.pieces.Rook;
import boardgame.Board;

public class ChessMatch {

	private static Board board;
	
	public ChessMatch () {
		board = new Board(8,8);
		initialSetup();
	}
	
	public static ChessPiece[][] getpieces(){// este metodo vai retornar uma matriz de pe�a de xadrez correspon de a partida 
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
		placeNewPiece('c', 1, new Rook(board, Color.White));
        placeNewPiece('c', 2, new Rook(board, Color.White));
        placeNewPiece('d', 2, new Rook(board, Color.White));
        placeNewPiece('e', 2, new Rook(board, Color.White));
        placeNewPiece('e', 1, new Rook(board, Color.White));
        placeNewPiece('d', 1, new King(board, Color.White));

        placeNewPiece('c', 7, new Rook(board, Color.Black));
        placeNewPiece('c', 8, new Rook(board, Color.Black));
        placeNewPiece('d', 7, new Rook(board, Color.Black));
        placeNewPiece('e', 7, new Rook(board, Color.Black));
        placeNewPiece('e', 8, new Rook(board, Color.Black));
        placeNewPiece('d', 8, new King(board, Color.Black));
	   }
	}

	

