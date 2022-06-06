import move.Move;
import rover.*;
import direction.Direction;
import org.junit.jupiter.api.Test;
import position.Position;

import static org.assertj.core.api.Assertions.assertThat;

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



}
