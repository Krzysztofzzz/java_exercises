package com.zubrycky.lesson.lesson_12_nested_class;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static com.zubrycky.utils.Utils.print;

public class Lesson12 implements Runnable {
    @Override
    public void run() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(UUID.randomUUID().toString(), "zadanie1"));
        tasks.add(new Task(UUID.randomUUID().toString(), "zadanie2"));

        Task zadanie3 = new Task(UUID.randomUUID().toString(), "zadanie3");
        zadanie3.addSubtask("podzadanie1");
        zadanie3.addSubtask("podzadanie2");

        Task.SubTask subTask1 = zadanie3.new SubTask(UUID.randomUUID().toString(), "podzadanie3");
        zadanie3.addSubtask(subTask1);

        Task.SubTask.SubSubTask subSubTask1 = new Task.SubTask.SubSubTask("podzadaniepodzdania");
        subTask1.addSubSubTask(subSubTask1);

        tasks.add(zadanie3);

        print(tasks);
    }
}
