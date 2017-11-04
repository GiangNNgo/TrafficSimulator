package util.enums;

import model.Intersection;

public enum IntersectionLightState {
    ALL_STOP_1(0),
    GO_NS(1),
    SLOW_NS(2),
    ALL_STOP_2(3),
    GO_EW(4),
    SLOW_EW(5);

    int value;

    IntersectionLightState(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public static IntersectionLightState fromInteger(int x) {
        switch(x) {
            case 0:
                return ALL_STOP_1;
            case 1:
                return GO_NS;
            case 2:
                return SLOW_NS;
            case 3:
                return ALL_STOP_2;
            case 4:
                return GO_EW;
            case 5:
                return SLOW_EW;
        }
        return null;
    }
}
