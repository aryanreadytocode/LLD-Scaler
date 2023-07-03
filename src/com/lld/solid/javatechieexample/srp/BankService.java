package com.lld.solid.javatechieexample.srp;

/*This class has too many responsibilities which doesn't follow Single Responsibility Principle*/
public class BankService {

    public long deposit(long amount, String accountNo) {
        // deposit amount
        return 0;
    }

    public long withDraw(long amount, String accountNo) {
        // withdraw amount
        return 0;
    }

    public void printPassbook() {
        // update transaction info in passbook
    }

    public void getLoanInterestInfo(String loanType) {
        if (loanType.equals("homeLoan")){
            // do some job
        }
        if (loanType.equals("personalLoan")){
            // do some job
        }
        if (loanType.equals("car")){
            // do some job
        }
    }

    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            // write email related Logic
            // use Java mail sender api
        }
    }

}
