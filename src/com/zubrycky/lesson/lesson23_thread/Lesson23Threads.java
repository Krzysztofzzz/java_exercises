package com.zubrycky.lesson.lesson23_thread;

import static com.zubrycky.utils.Utils.print;

public class Lesson23Threads implements Runnable {
    @Override
    public void run() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                printLoop();
            }
        }, "thread 1").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                printLoop();
            }
        }, "thread 2").start();
    }

    private void printLoop() {
        for (int i = 0; i < 100; i++) {
            print(Thread.currentThread().getName() + ": " + i);
        }
    }
}
