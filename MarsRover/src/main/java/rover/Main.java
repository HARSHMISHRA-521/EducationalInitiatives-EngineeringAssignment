package main.java;

import rover.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Initialize grid, rover, and obstacles
        Grid grid = new Grid(10, 10);
        Rover rover = new Rover(0, 0, Direction.NORTH, grid, new ArrayList<>());
        
        // Example commands
        List<Command> commands = new ArrayList<>();
        commands.add(new MoveCommand(rover));
        commands.add(new MoveCommand(rover));
        commands.add(new TurnRightCommand(rover));
        commands.add(new MoveCommand(rover));
        commands.add(new TurnLeftCommand(rover));
        commands.add(new MoveCommand(rover));
        
        // Execute commands
        for (Command command : commands) {
            command.execute();
        }
        
        // Get final position and status report
        System.out.println("Final Position: (" + rover.getX() + ", " + rover.getY() + ", " + rover.getDirection() + ")");
        System.out.println("Status Report: " + rover.getStatusReport());
    }
}
