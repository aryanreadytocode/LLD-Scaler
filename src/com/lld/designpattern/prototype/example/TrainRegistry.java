package com.lld.designpattern.prototype.example;

import java.util.HashMap;
import java.util.Map;

public class TrainRegistry {

    private Map<String, Train> registry;

    public TrainRegistry() {
        registry = new HashMap<>();
    }

    public Train get(String trainName) {
        return registry.get(trainName);
    }

    public void save(Train train) {
        registry.put(train.getName(), train);
    }

}
