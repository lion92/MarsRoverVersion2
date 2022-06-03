package direction.implement;

import direction.Direction;
import position.Position;
import rover.Rover;
import direction.iDirection.IDirection;

public class North implements IDirection {
    private Rover rover;

    public North(Rover rover){
        this.rover=rover;
    }


    @Override
    public Rover moveForward() {
        Position newPosition=new Position(this.rover.getPosition().abscissa(),this.rover.getPosition().ordinate()+1);
        this.rover=new Rover(newPosition, Direction.NORTH);
        return this.rover;
    }

    @Override
    public Rover moveBackward() {
        Position newPosition=new Position(this.rover.getPosition().abscissa(),this.rover.getPosition().ordinate()-1);
        this.rover=new Rover(newPosition,Direction.NORTH);
        return this.rover;
    }
}
