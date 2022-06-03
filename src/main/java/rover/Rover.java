package rover;

import direction.implement.North;
import direction.implement.South;
import move.Move;
import direction.Direction;
import position.Position;

import java.util.Objects;

public class Rover {
    private Position position;
    private final Direction direction;

    public Rover(Position position, Direction north) {
        this.position = position;
        this.direction = north;
    }

    public Position getPosition() {
        return position;
    }


    public void move(Move move) {
        if (move.equals(Move.FORWARD) && direction.equals(Direction.SOUTH)) {
            position = new South(this).moveForward().position;

        } else {
            position = new North(this).moveForward().position;

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rover rover)) return false;
        return Objects.equals(position, rover.position) && direction == rover.direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, direction);
    }

    @Override
    public String toString() {
        return "Rover{" +
                "position=" + position +
                ", direction=" + direction +
                '}';
    }
}
