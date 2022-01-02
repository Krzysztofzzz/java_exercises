package com.zubrycky.lesson6;

import com.zubrycky.lesson5.CreditCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.zubrycky.utils.Utils.print;

public class Lesson6 implements Runnable {
    @Override
    public void run() {
        List<CreditCard> creditCards = new ArrayList<>();
        addNewCard(creditCards);
        printCreditCards(creditCards);
    }

    private void addNewCard(List<CreditCard> creditCardList) {
        Random random = new Random();
        CreditCard creditCard1 = new CreditCard(random.nextLong());
        creditCardList.add(creditCard1);
    }

    private void printCreditCards(List<CreditCard> creditCardList) {
        for (CreditCard card : creditCardList) {
            print(card);
        }
    }
}
