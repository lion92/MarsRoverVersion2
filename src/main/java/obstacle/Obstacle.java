package obstacle;

import position.Position;

import java.util.Objects;

public class Obstacle {
    private final Position position;

    public Obstacle(Position position) {

        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Obstacle)) return false;
        Obstacle obstacle = (Obstacle) o;
        return Objects.equals(position, obstacle.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    @Override
    public String toString() {
        return "Obstacle{" +
                "position=" + position +
                '}';
    }
}
