package src.game;
import src.boardException.IllegalPosition;

public class ChessBoard {
    private int cases[][];
    public ChessBoard()
    {
        this.cases = new int[8][8];
    }
    public boolean isOccupied(Coord coord)
    {
        return this.cases[coord.getX()][coord.getY()] != 0;
    }
    public void setOccupation(Coord pos, boolean in)
    {
        try
        {
            if(pos.getX() < 0 || pos.getX() > 7 || pos.getY() < 0 || pos.getY() > 7)
            {
                throw new IllegalPosition("Out of bounds, you tried to access the position (" + pos.getX() + ", " + pos.getY() + ")");
            }
            if (in)
            {
                this.cases[pos.getX()][pos.getY()] = 1;
            }
            else
            {
                this.cases[pos.getX()][pos.getY()] = 0;
            }
        }
        catch (IllegalPosition e)
        {
            System.out.println(e.getMessage());
            return;
        }
    }
    public void smartPrint()
    {
        for (int i = 0; i < 8; i++)
        {
            System.out.print("|");
            for (int j = 0; j < 8; j++)
            {
                if (this.cases[i][j] == 0)
                    System.out.print(" ");
                else
                    System.out.print("X");
                System.out.print("|");
            }
            System.out.println();
        }
    }
}