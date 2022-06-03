package direction.implement;

import direction.Direction;
import direction.iDirection.IDirection;
import position.Position;
import rover.Rover;

public class South extends Rover implements IDirection {


    public South(Position position, Direction direction) {
        super(position, direction);
    }

    @Override
    public Rover moveForward() {
        Position newPosition=new Position(this.getPosition().abscissa(),this.getPosition().ordinate()-1);
        this.position=newPosition;
        return this;

    }

    @Override
    public Rover moveBackward() {
        Position newPosition=new Position(this.getPosition().abscissa(),this.getPosition().ordinate()+1);
       this.position= newPosition;
        return this;
    }
}
