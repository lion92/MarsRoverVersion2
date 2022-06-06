package direction.implement;

import direction.Direction;
import direction.iDirection.IDirection;
import move.Move;
import position.Position;
import rover.Rover;

public class RoverFacingSouth implements IDirection {

    private Rover rover;

    public RoverFacingSouth(Rover rover){

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


}
