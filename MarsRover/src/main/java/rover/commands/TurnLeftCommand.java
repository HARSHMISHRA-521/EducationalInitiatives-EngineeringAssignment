package rover.commands;

import rover.Rover;

/**
 * Command to turn the Rover left.
 */
public class TurnLeftCommand implements Command {
    private Rover rover;

    public TurnLeftCommand(Rover rover) {
        this.rover = rover;
    }


    /**
     * Executes the turn left command for the rover.
     */
    @Override
    public void execute() {
        rover.turnLeft();
    }
}
