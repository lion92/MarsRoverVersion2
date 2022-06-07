package parserCommand;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Parser {
    private final String chaineCommand;

    public Parser(String chaineCommand) {
        this.chaineCommand = chaineCommand;
    }

    public List<Command> getCommand() {
        List<Command> listCommand = new ArrayList<>();

        for (char unitCommand :
                chaineCommand.toCharArray()) {
            listCommand.add(new Command(unitCommand));
        }
        return listCommand;
    }
}
