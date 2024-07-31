
package board;

import pieces.PieceIdentifier;

import java.util.HashMap;

public class PrintBoard {
    public static HashMap<Enum, String> pieceIcon;
    private static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE
    private static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    private static final String MAGENTA = "\033[0;35m";


    static {
        pieceIcon = new HashMap<>();
        pieceIcon.put(PieceIdentifier.BISHOP, "♗");
        pieceIcon.put(PieceIdentifier.KING, "♔");
        pieceIcon.put(PieceIdentifier.PAWN, "♙");
        pieceIcon.put(PieceIdentifier.KNIGHT, "♘");
        pieceIcon.put(PieceIdentifier.QUEEN, "♕");
        pieceIcon.put(PieceIdentifier.ROOK, "♖");
    }

    public static void printBoard(Board board, boolean isWhite) {
        if (isWhite) {
            printWhiteBoard(board);
        } else {
            printBlackBoard(board);
        }
    }

    public static void printBlackBoard(Board board) {
        int count;
        for (int i = 0; i < Board.BOARD_SIZE; i++) {
            count = i;
            for (int j = 0; j < Board.BOARD_SIZE; j++) {
                if (j == 0) {
                    System.out.print(WHITE_BOLD_BRIGHT + (++count));
                }
                if (board.getBoard()[i][j] == null) {
                    System.out.print(MAGENTA + "\t☐");
                } else {
                    if (board.getBoard()[i][j].isWhite()) {
                        System.out.print("\t" + WHITE_BOLD_BRIGHT + pieceIcon.get(board.getBoard()[i][j].getPieceIdentifier()));
                    } else {
                        System.out.print("\t" + BLACK_BOLD_BRIGHT + pieceIcon.get(board.getBoard()[i][j].getPieceIdentifier()));
                    }
                }
            }
            System.out.println("");
        }
        System.out.print(WHITE_BOLD_BRIGHT + "    h   g   f   e   d   c   b   a");
    }

    public static void printWhiteBoard(Board board) {
        int count = 9;
        for (int i = Board.BOARD_SIZE - 1; i >= 0; i--) {
            for (int j = Board.BOARD_SIZE - 1; j >= 0; j--) {
                if (j == 7) {
                    System.out.print(WHITE_BOLD_BRIGHT + (--count));
                }
                if (board.getBoard()[i][j] == null) {
                    System.out.print(MAGENTA + "\t☐");
                } else {
                    if (board.getBoard()[i][j].isWhite()) {
                        System.out.print("\t" + WHITE_BOLD_BRIGHT + pieceIcon.get(board.getBoard()[i][j].getPieceIdentifier()));
                    } else {
                        System.out.print("\t" + BLACK_BOLD_BRIGHT + pieceIcon.get(board.getBoard()[i][j].getPieceIdentifier()));
                    }
                }
            }
            System.out.println("");
        }
        System.out.print(WHITE_BOLD_BRIGHT + "    a   b   c   d   e   f   g   h");
    }
}
