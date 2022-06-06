package direction.implement;


import direction.Direction;
import position.Position;
import rover.Rover;
import direction.iDirection.IDirection;

public class RoverFacingNorth implements IDirection {


   private Rover rover;


    public RoverFacingNorth(Rover rover) {
       this.rover=rover;
    }

    @Override
    public void moveForward() {
        Position newPosition=new Position(rover.getPosition().abscissa(),rover.getPosition().ordinate()+1);
        rover.setPosition(newPosition);

    }

    @Override
    public void moveBackward() {
        Position newPosition=new Position(rover.getPosition().abscissa(),rover.getPosition().ordinate()-1);
        rover.setPosition(newPosition);
    }

    @Override
    public void turnRight() {
        rover.setDirection(Direction.WEST);
    }

    @Override
    public void turnLeft() {
        rover.setDirection(Direction.EAST);
    }
}
