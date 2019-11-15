package Utils;

import Enums.Commands;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandParserTest {
    @Test
    public void hasNext() {
        CommandParser cp1 = new CommandParser("F");
        Assertions.assertEquals(true, cp1.hasNext());

        CommandParser cp2 = new CommandParser("");
        Assertions.assertEquals(false, cp2.hasNext());
    }

    @Test
    public void next() {
        CommandParser cp = new CommandParser("FBLRXF");
        Assertions.assertEquals(Commands.F, cp.next());
        Assertions.assertEquals(Commands.B, cp.next());
        Assertions.assertEquals(Commands.L, cp.next());
        Assertions.assertEquals(Commands.R, cp.next());
        Assertions.assertEquals(Commands.UNDEFINED, cp.next());
        Assertions.assertEquals(Commands.F, cp.next());
        Assertions.assertEquals(Commands.UNDEFINED, cp.next());
        Assertions.assertEquals(Commands.UNDEFINED, cp.next());
    }
}