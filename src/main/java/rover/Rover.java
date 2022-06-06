package rover;

import direction.iDirection.IDirection;
import direction.manager.ManagerDirection;
import move.Move;
import direction.Direction;
import position.Position;

import java.util.Objects;

public class Rover {

    private IDirection iDirection;
    protected Position position;
    protected Direction direction;
    private ManagerDirection managerDirection;

    private ManagerCommand managerCommand;

    public Rover(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
        managerDirection=new ManagerDirection(this);
        iDirection=managerDirection.implementationDirection(direction);


    }




    public Position getPosition() {
        return position;
    }


    public void receiveCommand(Move move) {

        new ManagerCommand(this).receiveCommand(move);

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
        iDirection=managerDirection.implementationDirection(direction);
    }

    public IDirection getiDirection() {
        return iDirection;
    }

}
