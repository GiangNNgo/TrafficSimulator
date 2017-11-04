package model;

import controller.LightStateController;
import util.DirectionChooser;
import util.enums.Direction;
import util.enums.IntersectionLightState;
import world.Point;

public class Intersection {
    private RoadSet incomingRoads;
    private RoadSet outgoingRoads;
    private double roadDensity;
    private  DirectionChooser directionChooser;

    private LightStateController lightStateController;
    Point location;

    Intersection(IntersectionLightState startState) {
        this.lightStateController = new LightStateController(startState);
        this.directionChooser = new DirectionChooser();
    }

    public void tick() {
        moveCars();
    }

    private void moveCars() {
        if (!lightStateController.isMoving())
            return;

        if (lightStateController.state() == IntersectionLightState.GO_EW) {
            moveCarsFrom(Direction.EAST);
            moveCarsFrom(Direction.WEST);
        } else {
            moveCarsFrom(Direction.NORTH);
            moveCarsFrom(Direction.SOUTH);
        }
    }

    private void moveCarsFrom(Direction d) {
        if (!incomingRoads.getRoad(d).isEmpty())
            return;

        Direction destDirection = directionChooser.chooseDirectionStartingFrom(d);
        if (!outgoingRoads.getRoad(destDirection).isFull()) {
            incomingRoads.getRoad(d).removeCar();
            outgoingRoads.getRoad(destDirection).addCar();
        }
    }

    double roadDensity() {
        return incomingRoads.getTrafficDensity();
    }
}
