package com.lld.designpattern.observer;

public class WMSNotifier implements OrderPlacedSubscriber, OrderCancelled{

    public WMSNotifier() {
        Amazon a = Amazon.getInstance();
        a.registerSubscriber(this);
        a.registerCancelSubscriber(this);
    }

    @Override
    public ReturnData orderPlacedEvent() {
        ReturnData returnData = new ReturnData("Updating WMS after order placed");
        System.out.println("Updating WMS after order placed");
        return returnData;
    }

    @Override
    public ReturnData onOrderCancelled() {
        ReturnData returnData = new ReturnData("Notify all customer for cancellation");
        System.out.println("Notify all the customers for cancellation");
        return returnData;
    }
}
