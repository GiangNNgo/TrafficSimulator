package util;

import util.enums.Direction;

import java.util.Random;

public class DirectionChooser {
    private Random rand = new Random();

    public Direction chooseDirectionStartingFrom(Direction startDirection) {
        int destination = rand.nextInt() % 4;

        if (destination == 0) { // go left
            switch(startDirection) {
                case NORTH:
                    return Direction.WEST;
                case SOUTH:
                    return Direction.EAST;
                case EAST:
                    return Direction.NORTH;
                case WEST:
                    return Direction.SOUTH;
            }
        } else if (destination == 1) { // go right
            switch(startDirection) {
                case NORTH:
                    return Direction.EAST;
                case SOUTH:
                    return Direction.WEST;
                case EAST:
                    return Direction.SOUTH;
                case WEST:
                    return Direction.NORTH;
            }
        } else { // go straight
            return startDirection;
        }

        return null;
    }
}