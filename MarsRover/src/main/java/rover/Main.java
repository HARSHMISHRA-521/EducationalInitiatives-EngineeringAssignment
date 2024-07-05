package rover;

import java.util.ArrayList;
import java.util.List;
import rover.commands.Command;
import rover.commands.MoveCommand;
import rover.commands.TurnLeftCommand;
import rover.commands.TurnRightCommand;

public class Main {

    public static void main(String[] args) {
        Grid grid = new Grid(10, 10);
        List<Obstacle> obstacles = new ArrayList<>();
        obstacles.add(new Obstacle(2, 2));
        obstacles.add(new Obstacle(3, 5));

        Rover rover = new Rover(0, 0, Direction.NORTH, grid, obstacles);

        List<Command> commands = new ArrayList<>();
        commands.add(new MoveCommand(rover));
        commands.add(new MoveCommand(rover));
        commands.add(new TurnRightCommand(rover));
        commands.add(new MoveCommand(rover));
        commands.add(new TurnLeftCommand(rover));
        commands.add(new MoveCommand(rover));

        for (Command command : commands) {
            command.execute();
        }

        System.out.println("Final Position: (" + rover.getX() + ", " + rover.getY() + ", " + rover.getDirection() + ")");
        System.out.println("Status Report: " + rover.getStatusReport());
    }
}
