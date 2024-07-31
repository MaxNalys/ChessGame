package pieces;

public class Queen extends Piece{
    public Queen(boolean isWhite) {
        super(PieceIdentifier.QUEEN,  isWhite);
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
