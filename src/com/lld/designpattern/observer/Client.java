package com.lld.designpattern.observer;

public class Client {

    public static void main(String[] args) {
        Amazon a = Amazon.getInstance();
        CustomerNotifier customerNotifier = new CustomerNotifier();
        WMSNotifier wmsNotifier = new WMSNotifier();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        a.orderPlaced();
        a.deRegisterSubscriber(wmsNotifier);
        a.orderPlaced();
        a.onOrderCancelled();
        a.deRegisterCancelSubscriber(invoiceGenerator);
        a.onOrderCancelled();
    }
}
