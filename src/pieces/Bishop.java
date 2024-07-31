package pieces;

public class Bishop extends Piece{
    public Bishop(boolean isWhite) {
        super(PieceIdentifier.BISHOP,  isWhite);
    }

    @Override
    public boolean isWhite() {
        return false;
    }

    @Override
    public PieceIdentifier getPieceIdentifier() {
        return PieceIdentifier.BISHOP;
    }
}
