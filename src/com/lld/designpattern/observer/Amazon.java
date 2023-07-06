package com.lld.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {

    private List<OrderPlacedSubscriber> orderList;

    private static Amazon instance;

    private Amazon() {
        this.orderList = new ArrayList<>();
    }

    public void registerSubscriber(OrderPlacedSubscriber subscriber) {
        orderList.add(subscriber);
    }

    public void deRegisterSubscriber(OrderPlacedSubscriber subscriber) {
        orderList.remove(subscriber);
    }

    public void orderPlaced() {
        orderList.forEach(OrderPlacedSubscriber::orderPlacedEvent);
    }

    public static Amazon getInstance() {
        if (instance == null) {
            synchronized (Amazon.class) {
                if (instance == null)
                    instance = new Amazon();
            }
        }
        return instance;
    }
}
