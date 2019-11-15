import Enums.Commands;
import Enums.Directions;

public class Rover {
    Position position;
    Directions dir;

    public Rover(Position position, Directions dir) {
        this.position = position;
        this.dir = dir;
    }

    public void move(Commands command, int maxHeight, int maxWidth) {
        switch (command) {
            case F:
                position.forward(dir);
                break;
            case B:
                position.forward(Directions.oppositeDirection(dir));
                break;
            case L:
                dir = Directions.rotate(dir, true);
                break;
            case R:
                dir = Directions.rotate(dir, false);
                break;
            default:
                break;
        }
        position.normalizePosition(maxHeight, maxWidth);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return position.equals(rover.position) &&
                dir == rover.dir;
    }
}
