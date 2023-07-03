package com.lld.designpattern.adapter.bankPlatforms;

import com.lld.designpattern.adapter.BankApiAdapter;

public class ICICIBankApiAdapter implements BankApiAdapter {

    private ICICIBankApi iciciBankApi;

    public ICICIBankApiAdapter(ICICIBankApi iciciBankApi) {
        this.iciciBankApi = iciciBankApi;
    }

    @Override
    public double checkBalance() {
        return iciciBankApi.queryBalance();
    }

    @Override
    public boolean authenticate() {
        return iciciBankApi.checkUser() == 1 ;
    }

    @Override
    public boolean transaction() {
        return iciciBankApi.transfer() == 1;
    }
}
