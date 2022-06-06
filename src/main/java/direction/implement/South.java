package direction.implement;

import direction.Direction;
import direction.iDirection.IDirection;
import position.Position;
import rover.Rover;

public class South implements IDirection {

    private Rover rover;

    public South(Rover rover){

        this.rover = rover;
    }


    @Override
    public void moveForward() {
        Position newPosition=new Position(rover.getPosition().abscissa(),rover.getPosition().ordinate()-1);
        rover.setPosition(newPosition);


    }

    @Override
    public void moveBackward() {
        Position newPosition=new Position(rover.getPosition().abscissa(),rover.getPosition().ordinate()+1);
        rover.setPosition(newPosition);

    }

    @Override
    public void turnRight() {
        rover.setDirection(Direction.EAST);
    }

    @Override
    public void turnLeft() {
        rover.setDirection(Direction.WEST);
    }


}
