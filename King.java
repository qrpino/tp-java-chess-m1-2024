class King extends Piece {
    public King(Color color, Piece coord) {
        super(color, coord);
    }
    public void move(Coord coord) {
        this.coord = coord;
    }
}