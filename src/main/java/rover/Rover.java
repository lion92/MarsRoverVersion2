package rover;

import direction.implement.North;
import direction.implement.South;
import move.Move;
import direction.Direction;
import position.Position;

import java.util.Objects;

public class Rover {
    protected Position position;
    protected Direction direction;

    public Rover(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }


    public Position getPosition() {
        return position;
    }


    public Rover move(Move move) {
        if (move.equals(Move.FORWARD) && direction.equals(Direction.SOUTH)) {
            position = new South(this.position,this.direction).moveForward().position;
            return this;

        } else if(move.equals(Move.FORWARD) && direction.equals(Direction.NORTH)){
            position = new North(this.position,this.direction).moveForward().position;
            return this;

        }
        else if(move.equals(Move.BACKWARD)&&direction.equals(Direction.NORTH)){
            position=new North(this.position,this.direction).moveBackward().position;
            return this;
        }

        else {
            position=new South(this.position,this.direction).moveBackward().position;
            return this;
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
