package pieces;

public class Rook extends Piece {
    private boolean isMoved;

    public Rook(boolean isWhite) {
        super(PieceIdentifier.ROOK, isWhite);
        this.isMoved = false;
    }

    public void setMoved(boolean moved) {
        isMoved = moved;
    }

    public boolean isMoved() {
        return isMoved;
    }

    @Override
    public boolean isWhite() {
        return false;
    }

    @Override
    public PieceIdentifier getPieceIdentifier() {
        return PieceIdentifier.ROOK;
    }
}
