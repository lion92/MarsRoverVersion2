package direction.implement;

import direction.Direction;
import direction.iDirection.IDirection;
import position.Position;
import rover.Rover;

public class South implements IDirection {
    private Rover rover;

    public South(Rover rover) {
        this.rover = rover;
    }

    @Override
    public Rover moveForward() {
        Position newPosition=new Position(this.rover.getPosition().abscissa(),this.rover.getPosition().ordinate()-1);
        this.rover=new Rover(newPosition,Direction.SOUTH);
        return this.rover;

    }

    @Override
    public Rover moveBackward() {
        Position newPosition=new Position(this.rover.getPosition().abscissa(),this.rover.getPosition().ordinate()+1);
        new Rover(newPosition,Direction.SOUTH);
        return this.rover;
    }
}
