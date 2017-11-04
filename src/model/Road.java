package model;

import util.enums.Direction;

import java.util.HashMap;
import java.util.Map;

public class Road {
    Direction direction;
    int capacity;
    int cars;
    Map<Integer,Integer> roadController;
    Intersection source;
    Intersection destination;
    double trafficDensity;

    Road(Direction direction, int capacity, Intersection source, Intersection destination) {
        this.direction = direction;
        this.source = source;
        this.destination = destination;
    }

    void addCar() {
        if (cars < capacity)
            cars++;
    }

    void removeCar() {
        if (cars > 0)
            cars--;
    }

    Direction direction() {
        return direction;
    }

    boolean isEmpty() {
        return cars == 0;
    }

    boolean isFull() {
        return cars == capacity;
    }

    double getTrafficDensity() {
        return cars / capacity;
    }
}