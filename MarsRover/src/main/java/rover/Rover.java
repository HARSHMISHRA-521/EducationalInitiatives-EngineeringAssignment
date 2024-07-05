package rover;

import java.util.List;

/**
 * Mars Rover simulation.
 */
public class Rover {
    private int x;
    private int y;
    private Direction direction;

    private Grid grid;
    private List<Obstacle> obstacles;

    public Rover(int x, int y, Direction direction, Grid grid, List<Obstacle> obstacles) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.grid = grid;
        this.obstacles = obstacles;
    }

    /**
     * Moves the Rover one step forward in the current direction.
     */
    public void move() {
        int newX = x;
        int newY = y;

        switch (direction) {
            case NORTH:
                newY++;
                break;
            case EAST:
                newX++;
                break;
            case SOUTH:
                newY--;
                break;
            case WEST:
                newX--;
                break;
        }

        if (isValidMove(newX, newY)) {
            x = newX;
            y = newY;
            System.out.println("Moved to (" + x + ", " + y + ")");
        } else {
            System.out.println("Obstacle detected or out of grid boundary. Cannot move.");
        }
    }

    /**
     * Turns the Rover 90 degrees to the left.
     */
    public void turnLeft() {
        direction = direction.leftDirection();
        System.out.println("Turned left. Now facing " + direction);
    }

    /**
     * Turns the Rover 90 degrees to the right.
     */
    public void turnRight() {
        direction = direction.rightDirection();
        System.out.println("Turned right. Now facing " + direction);
    }

    /**
     * Checks if there is an obstacle at the given coordinates.
     * @param x X-coordinate to check.
     * @param y Y-coordinate to check.
     * @return True if there is an obstacle, false otherwise.
     */
    public boolean detectObstacle(int x, int y) {
        for (Obstacle obstacle : obstacles) {
            if (obstacle.getX() == x && obstacle.getY() == y) {
                return true;
            }
        }
        return false;
    }

    /**
     * Generates a status report of the Rover's current position and direction.
     * @return Status report string.
     */
    public String getStatusReport() {
        return "Rover is at (" + x + ", " + y + ") facing " + direction + ".";
    }

    /**
     * Checks if the new coordinates are within grid boundaries and not obstructed by an obstacle.
     * @param newX New X-coordinate.
     * @param newY New Y-coordinate.
     * @return True if the move is valid, false otherwise.
     */
    private boolean isValidMove(int newX, int newY) {
        if (newX < 0 || newX >= grid.getWidth() || newY < 0 || newY >= grid.getHeight()) {
            return false; // Out of grid boundary
        }
        return !detectObstacle(newX, newY); // No obstacle at new position
    }

    // Getters for testing and status reporting
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }
}
