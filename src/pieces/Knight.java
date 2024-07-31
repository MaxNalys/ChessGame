package pieces;

public class Knight extends Piece{
    public Knight(boolean isWhite) {
        super(PieceIdentifier.KNIGHT,  isWhite);
    }

    @Override
    public boolean isWhite() {
        return false;
    }

    @Override
    public PieceIdentifier getPieceIdentifier() {
        return PieceIdentifier.KNIGHT;
    }
}

