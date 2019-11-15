package Utils;

import Enums.Commands;

public class CommandParser {
    String input;

    public CommandParser(String input) {
        this.input = input;
    }

    public boolean hasNext() {
        return input != null && !input.equals("");
    }
}
