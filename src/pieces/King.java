package pieces;

public class King extends Piece{
    private  boolean isMoved;

    public King( boolean isWhite) {
        super(PieceIdentifier.KING,  isWhite);
        this.isMoved=false;
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
        return PieceIdentifier.KING;
    }
}
