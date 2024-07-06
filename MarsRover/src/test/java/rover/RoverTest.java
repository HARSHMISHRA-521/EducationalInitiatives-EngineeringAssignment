package test.java.rover;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class RoverTest {

    @Test
    public void testMove() {
        Grid grid = new Grid(10, 10);
        List<Obstacle> obstacles = new ArrayList<>();
        Rover rover = new Rover(0, 0, Direction.NORTH, grid, obstacles);

        rover.move();
        assertEquals(0, rover.getX());
        assertEquals(1, rover.getY());
        assertEquals(Direction.NORTH, rover.getDirection());
    }

    @Test
    public void testTurnLeft() {
        Grid grid = new Grid(10, 10);
        List<Obstacle> obstacles = new ArrayList<>();
        Rover rover = new Rover(0, 0, Direction.NORTH, grid, obstacles);

        rover.turnLeft();
        assertEquals(Direction.WEST, rover.getDirection());
    }

    @Test
    public void testTurnRight() {
        Grid grid = new Grid(10, 10);
        List<Obstacle> obstacles = new ArrayList<>();
        Rover rover = new Rover(0, 0, Direction.NORTH, grid, obstacles);

        rover.turnRight();
        assertEquals(Direction.EAST, rover.getDirection());
    }

    @Test
    public void testObstacleDetection() {
        Grid grid = new Grid(10, 10);
        List<Obstacle> obstacles = new ArrayList<>();
        obstacles.add(new Obstacle(0, 1));
        Rover rover = new Rover(0, 0, Direction.NORTH, grid, obstacles);

        rover.move();
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());
    }

    @Test
    public void testStatusReport() {
        Grid grid = new Grid(10, 10);
        List<Obstacle> obstacles = new ArrayList<>();
        Rover rover = new Rover(0, 0, Direction.NORTH, grid, obstacles);

        String report = rover.getStatusReport();
        assertEquals("Rover is at (0, 0) facing N. No obstacles detected.", report);
    }
}
