import Enums.Directions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class PlutoTest {
    @Test
    public void executeCommandsNoObstacles() {
        Pluto pluto = new Pluto(100,
                100,
                new Rover(new Position(0,0), Directions.N),
                Collections.<Position>emptySet());

        pluto.executeCommands("FFRFF");

        Assertions.assertEquals(
                new Pluto(100,
                100,
                new Rover(new Position(2,2), Directions.E),
                Collections.<Position>emptySet()),
                pluto);
    }
}