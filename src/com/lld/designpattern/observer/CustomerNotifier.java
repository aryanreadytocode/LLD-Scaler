package com.lld.designpattern.observer;

public class CustomerNotifier implements OrderPlacedSubscriber, OrderCancelled{

    public CustomerNotifier() {
        Amazon a = Amazon.getInstance();
        a.registerSubscriber(this);
        a.registerCancelSubscriber(this);
    }

    @Override
    public ReturnData orderPlacedEvent() {
        ReturnData returnData = new ReturnData("Notify all the customers");
        System.out.println("Notify all the customers");
        return returnData;
    }

    @Override
    public ReturnData onOrderCancelled() {
        ReturnData returnData = new ReturnData("Notify all customer for cancellation");
        System.out.println("Notify all the customers for cancellation");
        return returnData;
    }
}
