package rover.commands;

import rover.Rover;

/**
 * Command to move the Rover forward.
 */
public class MoveCommand implements Command {
    private Rover rover;

    public MoveCommand(Rover rover) {
        this.rover = rover;
    }


    /**
     * Executes the move command for the rover.
     *
     * @return         	void
     */
    @Override
    public void execute() {
        rover.move();
    }
}
