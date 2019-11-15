import Enums.Commands;
import Enums.Directions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {
    @Test
    public void moveForwardTest() {
        int height = 100;
        int width = 100;

        Rover rover1 = new Rover(new Position(0,0), Directions.N);
        rover1.move(Commands.F, height, width);
        Assertions.assertEquals(new Rover(new Position(0,1), Directions.N),
                rover1);

        Rover rover2 = new Rover(new Position(0,0), Directions.W);
        rover2.move(Commands.F, height, width);
        Assertions.assertEquals(new Rover(new Position(99,0), Directions.W),
                rover2);
    }

    @Test
    public void moveBackwardsTest() {
        int height = 100;
        int width = 100;

        Rover rover1 = new Rover(new Position(0,0), Directions.N);
        rover1.move(Commands.B, height, width);
        Assertions.assertEquals(new Rover(new Position(0,99), Directions.N),
                rover1);

        Rover rover2 = new Rover(new Position(0,0), Directions.W);
        rover2.move(Commands.B, height, width);
        Assertions.assertEquals(new Rover(new Position(1,0), Directions.W),
                rover2);
    }

    @Test
    public void moveLeftTest() {
        int height = 100;
        int width = 100;

        Rover rover = new Rover(new Position(0,0), Directions.N);
        rover.move(Commands.L, height, width);
        Assertions.assertEquals(new Rover(new Position(0,0), Directions.W),
                rover);
    }

    @Test
    public void moveRightTest() {
        int height = 100;
        int width = 100;

        Rover rover = new Rover(new Position(0,0), Directions.N);
        rover.move(Commands.R, height, width);
        Assertions.assertEquals(new Rover(new Position(0,0), Directions.E),
                rover);
    }

}