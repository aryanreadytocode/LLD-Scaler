package com.lld.solid.javatechieexample.srp.solution;

public class NotificationService {

    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            // write email related Logic
            // use Java mail sender api
        }
        if (medium.equals("mobile")) {
            // write logic using twilio api
        }
    }
}
