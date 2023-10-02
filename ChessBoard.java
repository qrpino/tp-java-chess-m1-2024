class ChessBoard {
    private int cases[][];
    public ChessBoard()
    {
        this.cases = new int[8][8];
    }
    public boolean isOccupied(Coord coord)
    {
        return this.cases[coord.getX()][coord.getY()] != 0;
    }
    public void setPiece(Piece piece)
    {
        this.cases[piece.getCoord().getX()][piece.getCoord().getY()] = 1;
    }
}