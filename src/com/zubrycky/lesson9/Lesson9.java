package com.zubrycky.lesson9;

import com.zubrycky.lesson5.CardStatus;

import static com.zubrycky.utils.Utils.print;

public class Lesson9 implements Runnable{

    @Override
    public void run() {
        CardStatus cardStatus = CardStatus.ACTIVE;
        //printCardStatus(cardStatus);
        //printCardStatusOnSwitch(cardStatus);
        printCardStatusOnNewSwitch(cardStatus);
    }

    public void printCardStatus(CardStatus cardStatus){
//        if (cardStatus.equals(CardStatus.ACTIVE)){
//            print("Your card is ready to use.");
//        }else if (cardStatus.equals(CardStatus.INACTIVE)){
//            print("Please activate your card.");
//        }else {
//            print("Please contact support.");
//        }
        if (cardStatus==CardStatus.ACTIVE||cardStatus==CardStatus.INACTIVE){
            print("Card is ready or not.");
        }else {
            print("Please contact support.");
        }
    }

    private void printCardStatusOnSwitch(CardStatus cardStatus){
//        switch (cardStatus){
//            case INACTIVE:
//                print("Please activate your card.");
//                break;
//            case ACTIVE:
//                print("Your card is ready to use.");
//                break;
//            default:
//                print("Please contact support.");
//        }
//        switch (cardStatus){
//            case INACTIVE,ACTIVE:
//                print("Please activate your card.");
//                break;
//            default:
//                print("Please contact support.");
//        }
        switch (cardStatus){
            case INACTIVE:
            case ACTIVE:
                print("Your card is ready to use.");
                break;
            default:
                print("Please contact support.");
        }
    }
    private void printCardStatusOnNewSwitch(CardStatus cardStatus) {
        switch (cardStatus){
            case ACTIVE -> print("Your card is ready to use.");
            case INACTIVE -> print("Please activate your card.");
            default -> print("Please contact support.");
        }
    }

}
