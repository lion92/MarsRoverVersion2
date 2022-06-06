package direction.implement;


import direction.Direction;
import direction.iDirection.IDirection;
import position.Position;
import rover.Rover;

public class East implements IDirection {


 private Rover rover;
 
 public East(Rover rover){
     this.rover=rover;
 }

    @Override
    public void moveForward() {
        Position newPosition = new Position(rover.getPosition().abscissa() - 1, rover.getPosition().ordinate());
        rover.setPosition(newPosition);

    }

    @Override
    public void moveBackward() {
        Position newPosition = new Position(rover.getPosition().abscissa() + 1, rover.getPosition().ordinate());
        rover.setPosition(newPosition);

    }

    @Override
    public void turnRight() {

       rover.setDirection(Direction.NORTH);
    }

    @Override
    public void turnLeft() {
        rover.setDirection(Direction.SOUTH);
    }

}
