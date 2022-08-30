package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	public Piece (Board board) {// construtor 
		super();
		this.board = board;
		position = null;
		
	}
	protected Board getBoard() { // ser� acessado somente pela classe do tabuleiro e as subclasses
		return board;
	}
	
	
}
