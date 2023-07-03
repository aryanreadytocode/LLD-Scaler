package com.lld.designpattern.adapter.bankPlatforms;

public class YesBankApi {
    public double checkBalance() {
        return 0.0;
    }
    public boolean authenticateUser() {
        return true;
    }
    public boolean transaction() {
        return true;
    }
}
