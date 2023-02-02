package immutable;

public final class ImmutablePoint {
    private final double x;
    private final double y;

    public ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public ImmutablePoint() {
        this.y = 0.0;
        this.x=0.0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Immutable point {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
