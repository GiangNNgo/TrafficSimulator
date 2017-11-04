package controller;

import java.util.HashMap;
import java.util.Map;

public class RoadController {
    private Map<Integer,Integer> map;
    private int capacity;
    private int cars;

    public RoadController(int capacity) {
        this.map = new HashMap<>();
        for (int i=0; i< capacity; i++)
            map.put(i, -1);
    }
}
