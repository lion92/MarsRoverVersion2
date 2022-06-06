package rover;

import direction.iDirection.IDirection;
import direction.implement.RoverFacingEast;
import direction.implement.RoverFacingNorth;
import direction.implement.RoverFacingSouth;
import direction.implement.RoverFacingWest;
import move.Move;
import direction.Direction;
import position.Position;

import java.util.Objects;

public class Rover {

    private IDirection iDirection;
    protected Position position;
    protected Direction direction;

    public Rover(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
        if (direction.equals(Direction.SOUTH)) {
            iDirection = new RoverFacingSouth(this);
        } else if (direction.equals(Direction.NORTH)) {
            iDirection = new RoverFacingNorth(this);
        } else if (direction.equals(Direction.EAST)) {
            iDirection = new RoverFacingEast(this);
        } else if (direction.equals(Direction.WEST)) {
            iDirection = new RoverFacingWest(this);
        }

    }


    public Position getPosition() {
        return position;
    }


    public void receiveCommand(Move move) {

        if (move.equals(Move.FORWARD)) {
            iDirection.moveForward();
        } else if (move.equals(Move.BACKWARD)) {
            iDirection.moveBackward();
        }
        else if(move.equals(Move.TURNRIGHT)){
            iDirection.turnRight();
        }
        else if(move.equals(Move.TURNLEFT)){
            iDirection.turnLeft();
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

    public void setPosition(Position position) {
        this.position = position;
    }


    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
