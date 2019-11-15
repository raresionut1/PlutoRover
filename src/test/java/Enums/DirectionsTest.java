package Enums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DirectionsTest {
    @Test
    public void oppositeDirectionsTest() {
        for (Directions direction : Directions.values()) {
            Directions oppositeDirection;
            switch (direction) {
                case E:
                    oppositeDirection = Directions.W;
                    break;
                case W:
                    oppositeDirection = Directions.E;
                    break;
                case S:
                    oppositeDirection = Directions.N;
                    break;
                case N:
                    oppositeDirection = Directions.S;
                    break;
                default:
                    oppositeDirection = Directions.UNDEFINED;
                    break;
            }

            Assertions.assertEquals(oppositeDirection,
                    Directions.oppositeDirection(direction));
        }
    }
}