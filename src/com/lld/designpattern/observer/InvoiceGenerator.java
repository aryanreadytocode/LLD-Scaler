package com.lld.designpattern.observer;

public class InvoiceGenerator implements OrderPlacedSubscriber{

    public InvoiceGenerator() {
        Amazon a = Amazon.getInstance();
        a.registerSubscriber(this);
    }

    @Override
    public ReturnData orderPlacedEvent() {
        ReturnData returnData = new ReturnData("Invoice");
        System.out.println("Invoice is being generated");
        return returnData;
    }
}
