package pieces;

public abstract class Piece {
    PieceIdentifier pieceIdentifier;
    boolean isWhite;

    public Piece(PieceIdentifier pieceIdentifier, boolean isWhite) {
    }

    public abstract boolean isWhite();

    public abstract PieceIdentifier getPieceIdentifier();
}
