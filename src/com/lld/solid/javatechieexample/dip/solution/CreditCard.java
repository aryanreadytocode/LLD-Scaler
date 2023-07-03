package com.lld.solid.javatechieexample.dip.solution;

public class CreditCard implements BankCard{

    public void doTransaction(long amount) {
        System.out.println("Payment using Credit Card");
    }
}
