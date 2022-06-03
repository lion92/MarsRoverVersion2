package Rover;

import Move.Move;
import direction.Direction;
import position.Position;

import java.util.Objects;

public class Rover {
    private Position position;
    private Direction direction;

    public Rover(Position position, Direction north) {
        this.position = position;
        this.direction = north;
    }

    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }

    public Rover move(Move move) {
        if(direction.equals(Direction.NORTH))
        {
            if(move.equals(Move.FORWARD)){
                position=new Position(0,1);
                direction=Direction.NORTH;
                return this;
            }
        }
        else if(direction.equals(Direction.SOUTH)){
            if(move.equals(Move.FORWARD)){
                position=new Position(0,-1);
                direction=Direction.SOUTH;
                return this;
            }
        }

        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rover)) return false;
        Rover rover = (Rover) o;
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
