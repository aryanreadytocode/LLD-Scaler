package com.lld.solid.javatechieexample.dip;

public class ShoppingMall {

    private DebitCard card;

    public ShoppingMall(DebitCard card) {
        this.card = card;
    }

    public void doPurchaseSomething(long amount) {
        card.doTransaction(amount);
    }

    public static void main(String[] args) {
        // here it's dependency of debit card
        // so next time I need to do credit card shopping
        // need to change so many code in ShoppingMall class
        // this violates DIP
        DebitCard card = new DebitCard();
        ShoppingMall mall = new ShoppingMall(card);
    }
}
