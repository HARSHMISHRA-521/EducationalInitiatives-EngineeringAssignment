    package rover.commands;

import rover.Rover;

/**
 * Command to turn the Rover right.
 */
public class TurnRightCommand implements Command {
    private Rover rover;

    public TurnRightCommand(Rover rover) {
        this.rover = rover;
    }


    /**
     * Executes the turn right command for the rover.
     *
     * @return         	void
     */
    @Override
    public void execute() {
        rover.turnRight();
    }
}
