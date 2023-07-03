package com.lld.solid.javatechieexample.isp;

public class Paytm implements UPIPayments{
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCreditBalance() {
        // Not applicable for paytm
        // forcing this class to implements this method
        // which is violating Interface Segregation Principle ISP
    }
}
