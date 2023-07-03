package com.lld.designpattern.adapter;

public interface BankApiAdapter {
    double checkBalance();
    boolean authenticate();
    boolean transaction();

}
