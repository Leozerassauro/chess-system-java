package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

/*
 * @author Leonardo
 */
public class Rook extends ChessPiece {

    //constructor
    public Rook(Color color, Board board) {
        super(color, board);
    }

    //toString
    @Override
    public String toString() {
        return "R";
    }

}
