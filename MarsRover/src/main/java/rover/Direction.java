package rover;

public enum Direction {
    NORTH("N"), EAST("E"), SOUTH("S"), WEST("W");

    private String shortName;

    Direction(String shortName) {
        this.shortName = shortName;
    }

    /**
     * Returns the short name of the Direction.
     *
     * @return the short name of the Direction
     */

    public String getShortName() {
        return shortName;
    }



    /**
     * A method to calculate the direction when turning left.
     *
     * @return the new direction after turning left
     */

    public Direction leftDirection() {
        switch (this) {
            case NORTH:
                return WEST;
            case EAST:
                return NORTH;
            case SOUTH:
                return EAST;
            case WEST:
                return SOUTH;
            default:
                throw new IllegalArgumentException("Invalid direction");
        }
    }



    /**
     * Returns the direction that is one step to the right of the current
     * direction.
     *
     * @return the direction that is one step to the right of the current
     * direction.
     * @throws IllegalArgumentException if the current direction is invalid.
     */

    public Direction rightDirection() {
        switch (this) {
            case NORTH:
                return EAST;
            case EAST:
                return SOUTH;
            case SOUTH:
                return WEST;
            case WEST:
                return NORTH;
            default:
                throw new IllegalArgumentException("Invalid direction");
        }
    }


    /**
     * A description of the toString function.
     *
     * @return description of the returned string.
     */
    @Override
    public String toString() {
        return shortName;
    }
}
