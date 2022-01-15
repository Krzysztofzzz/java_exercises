package com.zubrycky.excercise.excercise1;

import static com.zubrycky.utils.Utils.print;

public class TestAnimals implements Runnable {

    @Override
    public void run() {
        Fish d = new Fish("Nemo");
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        print("Testing fish named '" + d.getName() + "' :");
        d.eat();
        d.play();
        d.walk();
        print("Renaming " + d.getName());
        d.setName("Sharky");
        print("New name: " + d.getName());

        print("");

        print("Testing Cat named '" + c.getName() + "' :");
        c.walk();
        c.eat();
        c.play();

        print("");

        print("Testing animal 1:");
        a.eat();
        a.walk();


        print("");

        print("Testing animal 2:");
        e.walk();
        e.eat();


        print("");

        print("Testing pet 1:");
        p.play();
        p.setName("Kotek");
        print("Renamed: " + p.getName());


    }
}
