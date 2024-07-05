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

    public void turnLeft() {
        direction = direction.leftDirection();
        System.out.println("Turned left. Now facing " + direction);
    }

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
