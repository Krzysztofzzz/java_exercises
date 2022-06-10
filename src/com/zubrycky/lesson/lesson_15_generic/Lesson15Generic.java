package com.zubrycky.lesson.lesson_15_generic;

import com.zubrycky.exercise.exercise_1_inheritance.Animal;
import com.zubrycky.exercise.exercise_1_inheritance.Cat;
import com.zubrycky.lesson.lesson_3_equals.Person;

import static com.zubrycky.utils.Utils.print;

public class Lesson15Generic implements Runnable {
    @Override
    public void run() {
        Person person1 = new Person("Krzys", 1994);
        Person person2 = new Person("Miś", 2004);

        Stack<Person> stack = new StackImpl<>();
        print(stack.isEmpty());

        stack.push(person1);
        stack.push(person2);

        print(stack.isEmpty());

        try {
            Person personx = stack.pop();
            print(personx.equals(person2));

        } catch (StackIsEmptyException e) {
            e.printStackTrace();
        }

        try {
            Person persony = stack.peek();
            print(persony.equals(person1));
            print(stack.isEmpty());
        } catch (StackIsEmptyException e) {
            e.printStackTrace();
        }
        try {
            Person personz = stack.pop();
            print(personz.equals(person1));
            print(stack.isEmpty());
        } catch (StackIsEmptyException e) {
            e.printStackTrace();
        }

        try {
            stack.peek();
        } catch (StackIsEmptyException e) {
            e.printStackTrace();
        }

        Para<Person, Animal> para = new Para<>(
                person1,
                new Cat()
        );
        para.getTyp1();


    }
}
