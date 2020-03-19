package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

/*
 * @author Leonardo
 */
public class King extends ChessPiece {

    //constructor
    public King(Color color, Board board) {
        super(color, board);
    }

    //toString
    @Override
    public String toString() {
        return "K";
    }

}
