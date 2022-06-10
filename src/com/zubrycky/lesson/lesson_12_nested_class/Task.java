package com.zubrycky.lesson.lesson_12_nested_class;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Task {
    private final String id;
    private final String name;
    private final List<SubTask> subTasks = new ArrayList<>();
    private final String test = "krzycho";

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

    public void addSubtask(String name) {
        subTasks.add(new SubTask(UUID.randomUUID().toString(), name));
    }

    public void addSubtask(SubTask subTask) {
        subTasks.add(subTask);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", subTasks=" + subTasks +
                '}';
    }

    public class SubTask {
        private final String id;
        private final String name;
        private final List<SubSubTask> subSubTaskList = new ArrayList<>();

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

        public void addSubSubTask(SubSubTask subSubTask) {
            subSubTaskList.add(subSubTask);
        }

        @Override
        public String toString() {
            return "SubTask{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", taskName='" + Task.this.name + '\'' +
                    ", subSubTasks=" + subSubTaskList +
                    '}';
        }

        static class SubSubTask {
            private final String name;

            public SubSubTask(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            @Override
            public String toString() {
                return "SubSubTask{" +
                        "name='" + name + '\'' +
                        '}';
            }
        }
    }
}
