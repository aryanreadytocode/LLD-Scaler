package com.lld.designpattern.adapter;

import com.lld.designpattern.adapter.bankPlatforms.YesBankApi;

public class YesBankApiAdapter implements BankApiAdapter{

    private YesBankApi yesBankApi;

    public YesBankApiAdapter(YesBankApi yesBankApi) {
        this.yesBankApi = yesBankApi;
    }

    @Override
    public double checkBalance() {
        return yesBankApi.checkBalance();
    }

    @Override
    public boolean authenticate() {
        return yesBankApi.authenticateUser();
    }

    @Override
    public boolean transaction() {
        return yesBankApi.transaction();
    }
}
