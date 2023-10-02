package src.chessPiece;

import src.game.Coord;
import src.game.Piece;
import src.boardException.IllegalMove;

public class King extends Piece {
    public King(Color color, Coord coord) {
        super(color, coord);
    }
    public void move(Coord coord) {
        try
        {
            if(Math.abs(coord.getX() - this.coord.getX()) > 1 || Math.abs(coord.getY() - this.coord.getY()) > 1)
            {
                throw new IllegalMove("King can only move one square at a time");
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
        return "King at Position " + this.coord.toString() + " of color " + this.color.toString() + "\n";
    }
}