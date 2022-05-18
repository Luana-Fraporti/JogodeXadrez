package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class RookTorre extends ChessPiece {
    public RookTorre(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString(){
        return "R";
    }
}
