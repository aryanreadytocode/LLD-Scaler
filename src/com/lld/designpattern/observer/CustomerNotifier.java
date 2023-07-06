package com.lld.designpattern.observer;

public class CustomerNotifier implements OrderPlacedSubscriber{

    public CustomerNotifier() {
        Amazon a = Amazon.getInstance();
        a.registerSubscriber(this);
    }

    @Override
    public ReturnData orderPlacedEvent() {
        ReturnData returnData = new ReturnData("Notify all the customers");
        System.out.println("Notify all the customers");
        return returnData;
    }
}
