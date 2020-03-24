package chess;

import boardgame.Board;
import boardgame.Piece;

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

    //getters and setters
    public Color getColor() {
        return color;
    }

}
