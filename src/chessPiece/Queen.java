package src.chessPiece;
import src.game.Coord;
import src.game.Piece;

public class Queen extends Piece {
    public Queen(Color color, Coord coord) {
        super(color, coord);
    }
    public void move(Coord coord) {
        this.coord = coord;
    }
    public String toString() {
        return "Queen at Position " + this.coord.toString() + " of color " + this.color.toString() + "\n";
    }
}
