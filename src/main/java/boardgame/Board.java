package boardgame;

import chess.pieces.King;

public class Board<position> {
    private int row;
    private int columns;
    private Piece[][] pieces;

    public Board(int row, int columns) {
        if (row <1 || columns <1 ){
            throw new BoardException("Erro criando tabuleiro: e necessario que haja uma linha e uma coluna");
        }
        this.row = row;
        this.columns = columns;
        pieces = new Piece[row][columns];
    }

    public int getRow() {
        return row;
    }

    public int getColumns() {
        return columns;
    }
    public Piece piece(int row, int columns) {
        if (!positionExists(row,columns)){
            throw new BoardException("Position not on the board");
        }
        return pieces[row][columns];
    }

    public Piece piece(Position position) {
        if (!positionExists(position)){
            throw new BoardException("Position not on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position) {
        if (thereIsPiace(position)){
            throw new BoardException("There is already a piece on position"+position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }
    private boolean positionExists(int row, int columns){
      return   row >=0 && row < row && columns >= 0 && columns < columns;
    }

    public boolean positionExists(Position position){
      return positionExists(position.getRow(),position.getColumn());
    }

    public boolean thereIsPiace(Position position){
        if (!positionExists(position)){
            throw new BoardException("Position not on the board");
        }
         return piece (position) != null;
    }

    public void placePiece(King king) {
    }
}