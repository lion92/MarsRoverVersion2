package direction.implement;


import direction.Direction;
import direction.iDirection.IDirection;
import position.Position;
import rover.Rover;

public class East extends Rover implements IDirection {


    public East(Position position, Direction direction) {
        super(position, direction);
    }

    @Override
    public Rover moveForward() {
        Position newPosition=new Position(this.getPosition().abscissa()-1,this.getPosition().ordinate());
        this.position=newPosition;
        return this;
    }

    @Override
    public Rover moveBackward() {
        Position newPosition=new Position(this.getPosition().abscissa()+1,this.getPosition().ordinate());
        this.position=newPosition;
        return this;
    }
}
