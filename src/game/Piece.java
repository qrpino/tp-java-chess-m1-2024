package src.game;
public abstract class Piece {
    static public enum Color { WHITE, BLACK };
    protected Color color;
    protected Coord coord;
    public Piece(Color color, Coord coord)
    {
        this.color = color;
        this.coord = coord;
    }
    public Color getColor() { return this.color; }
    public Coord getCoord() { return this.coord; }
    public abstract void move(Coord coord);
    public abstract String toString();
}