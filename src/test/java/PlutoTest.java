import Enums.Directions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class PlutoTest {
    @Test
    public void executeCommandsNoObstacles() {
        Pluto pluto = new Pluto(100,
                100,
                new Rover(new Position(0, 0), Directions.N),
                Collections.<Position>emptySet());

        pluto.executeCommands("FFRFF");

        Assertions.assertEquals(
                new Pluto(100,
                        100,
                        new Rover(new Position(2, 2), Directions.E),
                        Collections.<Position>emptySet()),
                pluto);
    }

    @Test
    public void executeCommandsWithObstacles() {
        Set<Position> obstacles = new HashSet<Position>();
        obstacles.add(new Position(0, 2));

        Pluto pluto = new Pluto(100,
                100,
                new Rover(new Position(0, 0), Directions.N),
                obstacles);

        pluto.executeCommands("FFRFF");

        Assertions.assertEquals(
                new Pluto(100,
                        100,
                        new Rover(new Position(0, 1), Directions.N),
                        obstacles),
                pluto);
    }
}