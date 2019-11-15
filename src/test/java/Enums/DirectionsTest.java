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

    @Test
    public void rotateDirectionsTest() {
        for (Directions direction : Directions.values()) {
            Directions rotateLeftDirection;
            Directions rotateRightDirection;
            switch (direction) {
                case E:
                    rotateLeftDirection = Directions.N;
                    rotateRightDirection = Directions.S;
                    break;
                case W:
                    rotateLeftDirection = Directions.S;
                    rotateRightDirection = Directions.N;
                    break;
                case S:
                    rotateLeftDirection = Directions.E;
                    rotateRightDirection = Directions.W;
                    break;
                case N:
                    rotateLeftDirection = Directions.W;
                    rotateRightDirection = Directions.E;
                    break;
                default:
                    rotateLeftDirection = Directions.UNDEFINED;
                    rotateRightDirection = Directions.UNDEFINED;
                    break;
            }

            Assertions.assertEquals(rotateLeftDirection,
                    Directions.rotate(direction, true));
            Assertions.assertEquals(rotateRightDirection,
                    Directions.rotate(direction, false));
        }
    }
}