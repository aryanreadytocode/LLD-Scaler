package com.lld.designpattern.observer;

public class InvoiceGenerator implements OrderPlacedSubscriber, OrderCancelled{

    public InvoiceGenerator() {
        Amazon a = Amazon.getInstance();
        a.registerSubscriber(this);
        a.registerCancelSubscriber(this);
    }

    @Override
    public ReturnData orderPlacedEvent() {
        ReturnData returnData = new ReturnData("Invoice");
        System.out.println("Invoice is being generated");
        return returnData;
    }

    @Override
    public ReturnData onOrderCancelled() {
        ReturnData returnData = new ReturnData("Notify all customer for cancellation");
        System.out.println("Notify all the customers for cancellation");
        return returnData;
    }
}
