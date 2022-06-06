package position;

public record Position(int abscissa, int ordinate) {
    public Position {
        abscissa=abscissa%5==0?0:abscissa;
        ordinate=ordinate%5==0?0:ordinate;
    }
}

