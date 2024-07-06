package rover;

import java.util.List;

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
     * Moves the Rover in the specified direction if the move is valid.
     *
     * @param - No parameters
     * @return No return value
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
     * A method to turn the Rover left.
     *
     * @param No parameters
     * @return No return value
     */
    public void turnLeft() {
        direction = direction.leftDirection();
        System.out.println("Turned left. Now facing " + direction);
    }


    /**
     * A method to turn the Rover right.
     *
     * @param No parameters
     * @return No return value
     */

    public void turnRight() {
        direction = direction.rightDirection();
        System.out.println("Turned right. Now facing " + direction);
    }

    public boolean detectObstacle(int x, int y) {
        for (Obstacle obstacle : obstacles) {
            if (obstacle.getX() == x && obstacle.getY() == y) {
                return true;
            }
        }
        return false;
    }



    /**
     * Checks if the given coordinates represent a valid move on the grid.
     *
     * @param newX the x-coordinate of the new position
     * @param newY the y-coordinate of the new position
     * @return true if the move is valid, false otherwise
     */
    public String getStatusReport() {
        String obstacleStatus = detectObstacle(x, y) ? "Obstacles detected." : "No obstacles detected.";
        return "Rover is at (" + x + ", " + y + ") facing " + direction + ". " + obstacleStatus;
    }

    private boolean isValidMove(int newX, int newY) {
        if (newX < 0 || newX >= grid.getWidth() || newY < 0 || newY >= grid.getHeight()) {
            return false;
        }
        return !detectObstacle(newX, newY);
    }


    /**
     * Gets the x-coordinate value.
     *
     * @return The x-coordinate value.
     */
    public int getX() {
        return x;
    }



    /**
     * Retrieves the y-coordinate value.
     *
     * @return the y-coordinate value
     */
    public int getY() {
        return y;
    }



    /**
     * Retrieves the current direction of the Rover.
     *
     * @return the Direction enum representing the current direction of the
     * Rover
     */

    public Direction getDirection() {
        return direction;
    }


    /**
     * Sets the direction of the Rover.
     *
     * @param direction the new direction for the Rover
     */
    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
