package rover;

public class Grid {
    private int width;
    private int height;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
    }


    /**
     * Gets the width of the grid.
     *
     * @return The width of the grid.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Returns the height of the grid.
     *
     * @return the height of the grid
     */

    public int getHeight() {
        return height;
    }
}
