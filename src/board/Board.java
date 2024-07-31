package board;

import pieces.Piece;

public class Board {
    private final Piece[][] board;
    static final int BOARD_SIZE = 8;

    public Board() {
        this.board = new Piece[BOARD_SIZE][BOARD_SIZE];
    }


    public Piece[][] getBoard() {
        return board;
    }


}
