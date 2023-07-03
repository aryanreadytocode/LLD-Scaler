package com.lld.designpattern.adapter.bankPlatforms;

import com.lld.designpattern.adapter.BankApiAdapter;

public class PhonePe {

    private BankApiAdapter bankApiAdapter;

    public PhonePe(BankApiAdapter bankApiAdapter) {
        this.bankApiAdapter = bankApiAdapter;
    }

    public void transferMoney() {
        //1 Authenticate the user
        //2 Check enough balance available
        //3 transfer the amount
        if (bankApiAdapter.authenticate()) {
            if (bankApiAdapter.checkBalance() >= 0) {
                if (bankApiAdapter.transaction()) {
                    System.out.println("Transaction is done");
                }
            }
        }
    }
}
