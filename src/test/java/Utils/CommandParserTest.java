package Utils;

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
}