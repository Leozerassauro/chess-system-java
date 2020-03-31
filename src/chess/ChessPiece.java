package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

/*
 * @author Leonardo
 */
public abstract class ChessPiece extends Piece {

    //attributes
    private Color color;

    //constructor
    public ChessPiece(Color color, Board board) {
        super(board);
        this.color = color;
    }

    //getters
    public Color getColor() {
        return color;
    }
    
    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }

    //methods
    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }

}
