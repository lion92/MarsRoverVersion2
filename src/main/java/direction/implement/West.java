package direction.implement;

import direction.Direction;
import direction.iDirection.IDirection;
import position.Position;
import rover.Rover;

public class West implements IDirection {

    private Rover rover;

    public West(Rover rover){

        this.rover = rover;
    }

    @Override
    public void moveForward() {
        Position newPosition=new Position(rover.getPosition().abscissa()+1,rover.getPosition().ordinate());
        rover.setPosition(newPosition);
    }

    @Override
    public void  moveBackward() {
        Position newPosition=new Position(rover.getPosition().abscissa()-1,rover.getPosition().ordinate());
        rover.setPosition(newPosition);

    }

    @Override
    public void turnRight() {
        rover.setDirection(Direction.SOUTH);
    }

    @Override
    public void turnLeft() {
        rover.setDirection(Direction.NORTH);
    }
}
