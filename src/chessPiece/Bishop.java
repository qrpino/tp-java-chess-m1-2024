package src.chessPiece;

import src.game.Piece;
import src.game.Coord;

import src.boardException.IllegalMove;
public class Bishop extends Piece {
    public Bishop (Color color, Coord coord) {
        super(color, coord);
    }
    public void move(Coord coord) {
        try
        {
            if(Math.abs(coord.getX() - this.coord.getX()) != Math.abs(coord.getY() - this.coord.getY()))
            {
                throw new IllegalMove("Bishop can only move diagonally");
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
        return "Bishop at Position " + this.coord.toString() + " of color " + this.color.toString() + "\n";
    }
}
