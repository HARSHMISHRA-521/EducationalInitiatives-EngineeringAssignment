package rover;

public enum Direction {
    NORTH("N"), EAST("E"), SOUTH("S"), WEST("W");

    private String shortName;

    Direction(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }

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

    @Override
    public String toString() {
        return shortName;
    }
}
