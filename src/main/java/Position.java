import Enums.Directions;

public class Position {
    int x;
    int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void normalizePosition(int maxHeight, int maxWidth) {
        while(x < 0)
            x += maxWidth;
        while(y < 0)
            y += maxHeight;

        x = x % maxWidth;
        y = y % maxHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x &&
                y == position.y;
    }
}