package com.lld.solid.javatechieexample.ocp;

public interface NotificationService {

    public void sendOTP(String medium);

    public void sendTransactionReport(String medium);
}
