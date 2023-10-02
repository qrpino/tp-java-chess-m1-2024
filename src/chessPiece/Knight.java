package src.chessPiece;

import src.game.Piece;
import src.game.Coord;

import src.boardException.IllegalMove;

public class Knight extends Piece {
    public Knight(Color color, Coord coord) {
        super(color, coord);
    }
    public void move(Coord coord) {
        try
        {
            if(!(Math.abs(coord.getX() - this.coord.getX()) == 2 && Math.abs(coord.getY() - this.coord.getY()) == 1)
            || !(Math.abs(coord.getX() - this.coord.getX()) == 1 && Math.abs(coord.getY() - this.coord.getY()) == 2))
            {
                throw new IllegalMove("Knight can only move in L shape");
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
        return "Knight at Position " + this.coord.toString() + " of color " + this.color.toString() + "\n";
    }
}
