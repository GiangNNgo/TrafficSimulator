package model;

import util.enums.Direction;

public class RoadSet {
    double totalDensity;
    Road roadNorth;
    Road roadSouth;
    Road roadEast;
    Road roadWest;

    RoadSet(Road roadNorth, Road roadSouth, Road roadEast, Road roadWest) {
        this.roadNorth = roadNorth;
        this.roadSouth = roadSouth;
        this.roadEast = roadEast;
        this.roadWest = roadWest;
    }

    Road north() {
        return roadNorth;
    }

    Road south() {
        return roadSouth;
    }

    Road east() {
        return roadNorth;
    }

    Road west() {
        return roadWest;
    }

    Road getRoad(Direction d) {
        switch (d) {
            case NORTH:
                return roadNorth;
            case SOUTH:
                return roadSouth;
            case EAST:
                return roadEast;
            case WEST:
                return roadWest;
            default:
                return null;
        }
    }

    double getTrafficDensity() {
        return roadNorth.getTrafficDensity() +
                roadSouth.getTrafficDensity() +
                roadEast.getTrafficDensity() +
                roadWest.getTrafficDensity();
    }
}
