package util.enums;

public enum Direction {
    NORTH(0),
    SOUTH(1),
    EAST(2),
    WEST(3);

    int value;

    Direction(int value) {
        this.value = value;
    }

    int value() {
        return value;
    }

}