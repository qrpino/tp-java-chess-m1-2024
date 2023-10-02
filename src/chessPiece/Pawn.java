package src.chessPiece;

import src.game.Coord;
import src.game.Piece;

import src.boardException.IllegalMove;

public class Pawn extends Piece {
    public Pawn(Color color, Coord coord) {
        super(color, coord);
    }
    // TODO: Implement this method
    public void move(Coord coord) {
    }
    public String toString() {
        return "Pawn at Position " + this.coord.toString() + " of color " + this.color.toString() + "\n";
    }
}
