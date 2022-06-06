package rover;

import move.Move;
import rover.Rover;

public class ManagerCommand {
    Rover rover;
    public ManagerCommand(Rover rover){
        this.rover=rover;
    }

    public void receiveCommand(Move move){
        if (move.equals(Move.FORWARD)) {
            rover.getiDirection().moveForward();
        } else if (move.equals(Move.BACKWARD)) {
            rover.getiDirection().moveBackward();
        }
        else if(move.equals(Move.TURNRIGHT)){
            rover.getiDirection().turnRight();
        }
        else if(move.equals(Move.TURNLEFT)){
            rover.getiDirection().turnLeft();
        }
    }
}
