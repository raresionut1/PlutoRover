import Enums.Directions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PositionTest {
    @Test
    public void normalizePositionWhenPositionIsInTable() {
        int height = 100;
        int width = 100;
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Position position = new Position(x, y);
                Position normalizedPosition = new Position(x, y);
                normalizedPosition.normalizePosition(height, width);

                Assertions.assertEquals(position, normalizedPosition);
            }
        }
    }

    @Test
    public void normalizePositionWhenPositionIsBiggerThanLimits() {
        int height = 100;
        int width = 100;

        Position position = new Position(69, 5);
        Position normalizedPosition = new Position(669, 205);
        normalizedPosition.normalizePosition(height, width);

        Assertions.assertEquals(position, normalizedPosition);
    }

    @Test
    public void normalizePositionWhenPositionIsNegative() {
        int height = 100;
        int width = 100;

        Position position = new Position(99, 88);
        Position normalizedPosition = new Position(-1, -12);
        normalizedPosition.normalizePosition(height, width);

        Assertions.assertEquals(position, normalizedPosition);
    }

    @Test
    public void forwardPosition() {

        Position forwardNPosition = new Position(5, 5);
        forwardNPosition.forward(Directions.N);
        Assertions.assertEquals(new Position(5, 6), forwardNPosition);

        Position forwardSPosition = new Position(5, 5);
        forwardSPosition.forward(Directions.S);
        Assertions.assertEquals(new Position(5, 4), forwardSPosition);

        Position forwardWPosition = new Position(5, 5);
        forwardWPosition.forward(Directions.W);
        Assertions.assertEquals(new Position(4, 5), forwardWPosition);

        Position forwardEPosition = new Position(5, 5);
        forwardEPosition.forward(Directions.E);
        Assertions.assertEquals(new Position(6, 5), forwardEPosition);
    }
}