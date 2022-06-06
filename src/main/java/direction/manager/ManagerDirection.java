package direction.manager;

import direction.Direction;
import direction.iDirection.IDirection;
import direction.implement.East;
import direction.implement.North;
import direction.implement.South;
import direction.implement.West;
import rover.Rover;

public class ManagerDirection {

    private Rover rover;
    private IDirection iDirection;


    public ManagerDirection(Rover rover){
        this.rover=rover;
    }
    public IDirection implementationDirection(Direction direction) {
        if (direction.equals(Direction.SOUTH)) {
            iDirection = new South(rover);
        } else if (direction.equals(Direction.NORTH)) {
            iDirection = new North(rover);
        } else if (direction.equals(Direction.EAST)) {
            iDirection = new East(rover);
        } else if (direction.equals(Direction.WEST)) {
            iDirection = new West(rover);
        }
        return iDirection;
    }


}
