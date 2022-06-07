package rover;

import direction.iDirection.IDirection;
import direction.manager.ManagerDirection;
import move.Move;
import direction.Direction;
import obstacle.Obstacle;
import parserCommand.Command;
import position.Position;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Rover {
    private List<Obstacle> listObstacles;
    private IDirection iDirection;
    protected Position position;
    protected Direction direction;
    private final ManagerDirection managerDirection;

    private final ManagerCommand managerCommand;

    public Rover(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
        managerDirection = new ManagerDirection(this);
        iDirection = managerDirection.implementationDirection(direction);
        managerCommand=new ManagerCommand(this);
        listObstacles=new ArrayList<>();


    }


    public Position getPosition() {
        return position;
    }


    public void receiveCommand(Move move) {

        listObstacles.forEach(obstacle -> {
                    if (obstacle.getPosition().equals(position)) {

                        throw new RuntimeException("There are an obstacle in"+obstacle.getPosition().toString() );
                    }
                });
        System.out.println(this.toString());
        managerCommand.receiveCommand(move);


    }
     public void executionListCommand(List<Command> commandList){
         commandList.forEach(command ->this.receiveCommand(command.getMove()));

     }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rover rover)) return false;
        return Objects.equals(position, rover.position) && direction == rover.direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, direction);
    }

    @Override
    public String toString() {
        return "Rover{" +
                "position=" + position +
                ", direction=" + direction +
                '}';
    }

    public void setPosition(Position position) {
        this.position = position;
    }



    public void setDirection(Direction direction) {
        this.direction = direction;
        iDirection = managerDirection.implementationDirection(direction);
    }

    public IDirection getiDirection() {
        return iDirection;
    }

    public void addObstacle(Obstacle obstacle) {
    listObstacles.add(obstacle);

    }

    public List<Obstacle> getListObstacles() {
        return listObstacles;
    }
}
