package com.zubrycky.lesson12;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static com.zubrycky.utils.Utils.print;

public class Lesson12 implements Runnable{
    @Override
    public void run() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(UUID.randomUUID().toString(),"zadanie1"));
        tasks.add(new Task(UUID.randomUUID().toString(),"zadanie2"));

        Task zadanie3 = new Task(UUID.randomUUID().toString(),"zadanie3");
        zadanie3.addSubtask("podzadanie1");
        zadanie3.addSubtask("podzadanie2");

        tasks.add(zadanie3);

        print(tasks);
    }
}
