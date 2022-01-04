package com.zubrycky.lesson12;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Task {
    private String id;
    private String name;
    private List<SubTask> subTasks = new ArrayList<>();

    public Task(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addSubtask(String name){
        subTasks.add(new SubTask(UUID.randomUUID().toString(), name));
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", subTasks=" + subTasks +
                '}';
    }

    private class SubTask{
        private String id;
        private String name;

        public SubTask(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "SubTask{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
