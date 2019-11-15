import Utils.CommandParser;
import java.util.Set;

public class Pluto {
    int height;
    int width;
    Rover rover;
    Set<Position> obstacles;

    public Pluto(int height, int width, Rover rover, Set<Position> obstacles) {
        this.height = height;
        this.width = width;
        this.rover = rover;
        this.obstacles = obstacles;
    }

    public void executeCommands(String input) {
        CommandParser cp = new CommandParser(input);
        while(cp.hasNext()) {
            rover.move(cp.next(), height, width);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pluto pluto = (Pluto) o;
        return height == pluto.height &&
                width == pluto.width &&
                rover.equals(pluto.rover) &&
                obstacles.equals(pluto.obstacles);
    }
}
