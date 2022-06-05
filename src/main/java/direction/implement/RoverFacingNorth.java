package direction.implement;

import direction.Direction;
import position.Position;
import rover.Rover;
import direction.iDirection.IDirection;

public class RoverFacingNorth extends Rover implements IDirection {


    public RoverFacingNorth(Position position, Direction direction) {
        super(position, direction);
    }

    @Override
    public Rover moveForward() {
        Position newPosition=new Position(this.getPosition().abscissa(),this.getPosition().ordinate()+1);
        this.position=newPosition;
        return this;
    }

    @Override
    public Rover moveBackward() {
        Position newPosition=new Position(this.getPosition().abscissa(),this.getPosition().ordinate()-1);
        this.position=newPosition;
        return this;
    }
}
