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

    public void clear() {
        input = "";
    }

    public String getInput() {
        return input;
    }

    public Commands next() {
        if(!hasNext())
            return Commands.UNDEFINED;

        char c = input.charAt(0);
        input = input.substring(1);

        switch (c) {
            case 'F':
                return Commands.F;
            case 'B':
                return Commands.B;
            case 'L':
                return Commands.L;
            case 'R':
                return Commands.R;
            default:
                return Commands.UNDEFINED;
        }
    }
}
