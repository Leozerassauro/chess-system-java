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
    private int moveCount;

    //constructor
    public ChessPiece(Color color, Board board) {
        super(board);
        this.color = color;
    }

    //getters
    public Color getColor() {
        return color;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }

    //methods
    public void increaseMoveCount() {
        moveCount++;
    }

    public void decreaseMoveCount() {
        moveCount--;
    }

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }

}
