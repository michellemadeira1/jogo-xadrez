package Chess;

public class ChessException extends RuntimeException{
     private static final long serialVersionUID = 1L;
     
     
     public ChessException(String msg) {// para repassar para o construtor da super classe essa menssagem.
    	 super(msg); 
     }
}
