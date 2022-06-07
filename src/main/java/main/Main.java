package main;

import direction.Direction;
import parserCommand.Command;
import parserCommand.Parser;
import position.Position;
import rover.Rover;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Rover rover =new Rover(new Position(0,0), Direction.EAST);
        String command="FFFFFLRFFFLRB";
        Parser parser=new Parser(command);
        List<Command>commandList=parser.getCommand();
        rover.executionListCommand(commandList);
    }
}
