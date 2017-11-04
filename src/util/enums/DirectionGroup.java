package util.enums;

public enum DirectionGroup {
    NS(0),
    EW(1);

    int value;

    DirectionGroup(int value) {
        this.value = value;
    }

    int value() {
        return value;
    }
}