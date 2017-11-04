package controller;

import util.enums.IntersectionLightState;

public class LightStateController {
    private IntersectionLightState currentState;

    public LightStateController(IntersectionLightState startState) {
        this.currentState = startState;
    }

    public boolean isMoving() {
        return currentState == IntersectionLightState.GO_EW ||
                currentState == IntersectionLightState.GO_NS;
    }

    public IntersectionLightState state() {
        return currentState;
    }

    void advance() {
        this.currentState = IntersectionLightState.fromInteger((currentState.value() + 1) % 6);
    }
}