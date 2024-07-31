package pieces;

public class Pawn extends Piece{
    private  boolean isMoved;
    public Pawn(boolean isWhite) {
        super(PieceIdentifier.PAWN,  isWhite);
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
        return PieceIdentifier.QUEEN;
    }
}
