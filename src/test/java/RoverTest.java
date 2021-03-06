import move.Move;
import obstacle.Obstacle;
import parserCommand.Command;
import parserCommand.Parser;
import rover.*;
import direction.Direction;
import org.junit.jupiter.api.Test;
import position.Position;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class RoverTest {

    @Test
    public void given_the_rover_is_in_position_0x_0y_north_and_there_are_no_obstacles_when_it_goes_forward_then_he_should_be_in_0x_1y_north() {
        //Given
        Rover rover = new Rover(new Position(0, 0), Direction.NORTH);
        //When
        rover.receiveCommand(Move.FORWARD);
        //Then
        assertThat(rover).isEqualTo(new Rover(new Position(0, 1), Direction.NORTH));

    }

    @Test
    public void given_the_rover_is_in_position_0x_0y_south_and_there_are_no_obstacles_when_it_goes_forward_then_he_should_be_in_0x_moins1y_south() {
        //Given
        Rover rover = new Rover(new Position(0, 0), Direction.SOUTH);
        //When
        rover.receiveCommand(Move.FORWARD);
        //Then
        assertThat(rover).isEqualTo(new Rover(new Position(0, -1), Direction.SOUTH));

    }

    @Test
    public void given_the_rover_is_in_position_0x_0y_north_and_there_are_no_obstacles_when_it_goes_backward_then_he_should_be_in_0x_moins1y_north() {
        //Given
        Rover rover = new Rover(new Position(0, 0), Direction.NORTH);
        //When
        rover.receiveCommand(Move.BACKWARD);
        //Then
        assertThat(rover).isEqualTo(new Rover(new Position(0, -1), Direction.NORTH));

    }


    @Test
    public void given_the_rover_is_in_position_0x_0y_south_and_there_are_no_obstacles_when_it_goes_backward_then_he_should_be_in_0x_1y_south() {
        //Given
        Rover rover = new Rover(new Position(0, 0), Direction.SOUTH);
        //When
        rover.receiveCommand(Move.BACKWARD);
        //Then
        assertThat(rover).isEqualTo(new Rover(new Position(0, 1), Direction.SOUTH));

    }

    @Test
    public void given_the_rover_is_in_position_0x_0y_east_and_there_are_no_obstacles_when_it_goes_forward_then_he_should_be_in_moins1x_0y_east() {
        //Given
        Rover rover = new Rover(new Position(0, 0), Direction.EAST);
        //When
        rover.receiveCommand(Move.FORWARD);
        //Then
        assertThat(rover).isEqualTo(new Rover(new Position(-1, 0), Direction.EAST));

    }


    @Test
    public void given_the_rover_is_in_position_0x_0y_west_and_there_are_no_obstacles_when_it_goes_forward_then_he_should_be_in_1x_0y_west() {
        //Given
        Rover rover = new Rover(new Position(0, 0), Direction.WEST);
        //When
        rover.receiveCommand(Move.FORWARD);
        //Then
        assertThat(rover).isEqualTo(new Rover(new Position(1, 0), Direction.WEST));

    }


    @Test
    public void given_the_rover_is_in_position_0x_0y_east_and_there_are_no_obstacles_when_it_goes_backward_then_he_should_be_in_moins1x_0y_east() {
        //Given
        Rover rover = new Rover(new Position(0, 0), Direction.EAST);
        //When
        rover.receiveCommand(Move.BACKWARD);
        //Then
        assertThat(rover).isEqualTo(new Rover(new Position(1, 0), Direction.EAST));

    }

    @Test
    public void given_the_rover_is_in_position_0x_0y_west_and_there_are_no_obstacles_when_it_goes_backward_then_he_should_be_in_1x_0y_west() {
        //Given
        Rover rover = new Rover(new Position(0, 0), Direction.WEST);
        //When
        rover.receiveCommand(Move.BACKWARD);
        //Then
        assertThat(rover).isEqualTo(new Rover(new Position(-1, 0), Direction.WEST));

    }

    @Test
    public void given_the_rover_is_in_position_0x_0y_north_and_there_are_no_obstacles_when_it_turn_right_then_he_should_be_in_0x_0y_west() {
        //Given
        Rover rover = new Rover(new Position(0, 0), Direction.NORTH);
        //When
        rover.receiveCommand(Move.TURNRIGHT);
        //Then
        assertThat(rover).isEqualTo(new Rover(new Position(0, 0), Direction.WEST));

    }

    @Test
    public void given_the_rover_is_in_position_0x_0y_west_and_there_are_no_obstacles_when_it_turn_right_then_he_should_be_in_0x_0y_south() {
        //Given
        Rover rover = new Rover(new Position(0, 0), Direction.WEST);
        //When
        rover.receiveCommand(Move.TURNRIGHT);
        //Then
        assertThat(rover).isEqualTo(new Rover(new Position(0, 0), Direction.SOUTH));

    }

    @Test
    public void given_the_rover_is_in_position_0x_0y_south_and_there_are_no_obstacles_when_it_turn_right_then_he_should_be_in_0x_0y_east() {
        //Given
        Rover rover = new Rover(new Position(0, 0), Direction.SOUTH);
        //When
        rover.receiveCommand(Move.TURNRIGHT);
        //Then
        assertThat(rover).isEqualTo(new Rover(new Position(0, 0), Direction.EAST));

    }

    @Test
    public void given_the_rover_is_in_position_0x_0y_east_and_there_are_no_obstacles_when_it_turn_right_then_he_should_be_in_0x_0y_north() {
        //Given
        Rover rover = new Rover(new Position(0, 0), Direction.EAST);
        //When
        rover.receiveCommand(Move.TURNRIGHT);
        //Then
        assertThat(rover).isEqualTo(new Rover(new Position(0, 0), Direction.NORTH));

    }



    @Test
    public void given_the_rover_is_in_position_0x_0y_west_and_there_are_no_obstacles_when_it_turn_left_then_he_should_be_in_0x_0y_north() {
        //Given
        Rover rover = new Rover(new Position(0, 0), Direction.WEST);
        //When
        rover.receiveCommand(Move.TURNLEFT);
        //Then
        assertThat(rover).isEqualTo(new Rover(new Position(0, 0), Direction.NORTH));

    }

    @Test
    public void given_the_rover_is_in_position_0x_0y_south_and_there_are_no_obstacles_when_it_turn_left_then_he_should_be_in_0x_0y_west() {
        //Given
        Rover rover = new Rover(new Position(0, 0), Direction.SOUTH);
        //When
        rover.receiveCommand(Move.TURNLEFT);
        //Then
        assertThat(rover).isEqualTo(new Rover(new Position(0, 0), Direction.WEST));

    }

    @Test
    public void given_the_rover_is_in_position_0x_0y_east_and_there_are_no_obstacles_when_it_turn_left_then_he_should_be_in_0x_0y_south() {
        //Given
        Rover rover = new Rover(new Position(0, 0), Direction.EAST);
        //When
        rover.receiveCommand(Move.TURNLEFT);
        //Then
        assertThat(rover).isEqualTo(new Rover(new Position(0, 0), Direction.SOUTH));

    }

    @Test
    public void given_the_rover_is_in_position_0x_0y_north_and_there_are_no_obstacles_when_it_turn_left_then_he_should_be_in_0x_0y_east() {
        //Given
        Rover rover = new Rover(new Position(0, 0), Direction.NORTH);
        //When
        rover.receiveCommand(Move.TURNLEFT);
        //Then
        assertThat(rover).isEqualTo(new Rover(new Position(0, 0), Direction.EAST));

    }

    @Test
    public void given_the_rover_is_in_position_0x_0y_north_and_there_are_no_obstacles_when_it_turn_left_move_forward_move_forward_then_he_should_be_in_moins2x_0y_east() {
        //Given
        Rover rover = new Rover(new Position(0, 0), Direction.NORTH);
        //When
        rover.receiveCommand(Move.TURNLEFT);
        rover.receiveCommand(Move.FORWARD);
        rover.receiveCommand(Move.FORWARD);
        //Then
        assertThat(rover).isEqualTo(new Rover(new Position(-2, 0), Direction.EAST));

    }

    @Test
    public void given_the_rover_is_in_position_0x_0y_north_and_there_are_no_obstacles_when_it_move_forward_5_times_then_he_should_be_in_0_0y_east() {
        //Given
        Rover rover = new Rover(new Position(0, 0), Direction.NORTH);
        //When

        for(int i=0;i<5;i++){
            rover.receiveCommand(Move.FORWARD);
        }

        //Then
        assertThat(rover).isEqualTo(new Rover(new Position(0, 0), Direction.NORTH));

    }

    @Test
    public void given_the_rover_is_in_position_0x_0y_north_and_there_are_no_obstacles_when_it_move_forward_5_times_by_parsercommand_then_he_should_be_in_0_1y_north() {
        //Given
        Rover rover = new Rover(new Position(0, 0), Direction.NORTH);
        String ChaineCommand="FFFFFF";
        Parser parser = new Parser(ChaineCommand);
        List<Command> commandList=parser.getCommand();

        commandList.forEach(command -> rover.receiveCommand(command.getMove()));


        //Then
        assertThat(rover).isEqualTo(new Rover(new Position(0, 1), Direction.NORTH));

    }

    @Test
    public void given_the_rover_is_in_position_0x_0y_north_and_there_are_a_Obstacle_in_0_4_north_when_it_move_forward_5_times_by_parsercommand_then_he_return_obstacle_in_0_4_north() {





        //Then
        assertThatExceptionOfType(RuntimeException.class)
                .isThrownBy(() -> {
                    //Given
                    Rover rover = new Rover(new Position(0, 0), Direction.NORTH);
                    Obstacle obstacle=new Obstacle(new Position(0,4));
                    rover.addObstacle(obstacle);
                    String chaineCommand="FFFFFF";
                    Parser parser = new Parser(chaineCommand);
                    List<Command> commandList=parser.getCommand();
                    rover.executionListCommand(commandList);


                });
    }









}
