package src.chessPiece;

import src.game.Piece;
import src.game.Coord;

import src.boardException.IllegalMove;
public class Rook extends Piece {
    public Rook(Color color, Coord coord) {
        super(color, coord);
    }
    public void move(Coord coord) {
        try
        {
            if(coord.getX() != this.coord.getX() && coord.getY() != this.coord.getY())
            {
                throw new IllegalMove("Rook can only move horizontally or vertically");
            }
                this.coord = coord;
        }
        catch (IllegalMove e)
        {
            System.out.println(e.getMessage());
            return;
        }
    }
    public String toString() {
        return "Rook at Position " + this.coord.toString() + " of color " + this.color.toString() + "\n";
    }
}
