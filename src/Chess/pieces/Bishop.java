package Chess.pieces;


import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;
import boardgame.Position;

public class Bishop extends ChessPiece {

	public Bishop(Board board, Color color) {// o construtor está passando a chamada para a super classe
		super(board, color);
		
	}
	
	@Override
     public String toString() {
		return "B";
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean [] [] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0,0);
		
		// noroeste
		p.setValues(position.getRow() - 1 , position.getColumn()- 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()] [p.getColumn()]= true;
			p.setValues(p.getRow() - 1, p.getColumn() - 1);;
		}
		 if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			 mat [p.getRow()][p.getColumn()] = true;
		 }
		 
		 // nordeste
			p.setValues(position.getRow() -1 , position.getColumn()+1);
			while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()] [p.getColumn()]= true;
				p.setValues(p.getRow() - 1, p.getColumn()+1);
			}
			 if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				 mat [p.getRow()][p.getColumn()] = true;
			 }
			 
			 // sudeste
			 
				p.setValues(position.getRow()+ 1, position.getColumn()+1);
				while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
					mat[p.getRow()] [p.getColumn()]= true;
					p.setValues(p.getRow() + 1, p.getColumn()+1);
				}
				 if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					 mat [p.getRow()][p.getColumn()] = true;
				 }
			 
				 // sudoeste
				 
					p.setValues(position.getRow() + 1 , position.getColumn()-1);
					while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
						mat[p.getRow()] [p.getColumn()]= true;
						p.setValues(p.getRow() +1, p.getColumn()-1);
					}
					 if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
						 mat [p.getRow()][p.getColumn()] = true;
					 }
			 
			 
		return mat;
	}
}

