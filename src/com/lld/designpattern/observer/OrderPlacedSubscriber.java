package com.lld.designpattern.observer;

public interface OrderPlacedSubscriber {

    ReturnData orderPlacedEvent(); //action that needs to performed when the order placed event happen
}
// any class that wants to listen to OrderPlaced event will implement this interface
