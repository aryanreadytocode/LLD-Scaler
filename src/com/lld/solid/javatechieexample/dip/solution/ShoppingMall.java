package com.lld.solid.javatechieexample.dip.solution;

public class ShoppingMall {

    private BankCard card;

    public ShoppingMall(BankCard card) {
        this.card = card;
    }

    public void doPurchaseSomething(long amount) {
        card.doTransaction(amount);
    }

    public static void main(String[] args) {
        // Now ShoppingMall class doesn't need to
        // directly depend on credit or debit card
        BankCard card = new CreditCard();
        ShoppingMall mall = new ShoppingMall(card);
    }
}
