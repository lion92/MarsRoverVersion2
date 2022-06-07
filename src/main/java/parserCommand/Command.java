package parserCommand;

import move.Move;

public class Command {
    private char command;

    public Command(char command) {
        this.command = command;
    }

    public Move getMove(){
        if(this.command=='F'){
            return Move.FORWARD;
        }
        else if(this.command=='R'){
            return  Move.TURNRIGHT;
        }
        else if(this.command=='L'){
            return Move.TURNLEFT;
        }
            return Move.BACKWARD;

    }


    public char getCommand() {
        return command;
    }
}
