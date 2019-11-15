import Enums.Commands;
import Utils.CommandParser;

import java.util.Objects;
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
        while (cp.hasNext()) {
            Commands command = cp.next();
            rover.move(command, height, width);

            if (obstacles.contains(new Position(rover.position.x, rover.position.y))) {
                System.out.println("Rover hit an obstacle at position " +
                        "(X = " +
                        rover.position.x +
                        ", Y = " +
                        rover.position.y +
                        ")");
                System.out.println("Commands \"" +
                        cp.getInput() +
                        "\" discarded.");

                switch (command) {
                    case F:
                        rover.move(Commands.B, height, width);
                        break;
                    case B:
                        rover.move(Commands.F, height, width);
                        break;
                    default:
                }

                break;
            } else {
                System.out.println("Command " +
                        command +
                        " executed");
                System.out.println("New position: " +
                        "(X = " +
                        rover.position.x +
                        ", Y = " +
                        rover.position.y +
                        ")");
                System.out.println("Facing " +
                        rover.dir);
            }
            System.out.println();
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

    @Override
    public int hashCode() {
        return Objects.hash(height, width, rover, obstacles);
    }
}
