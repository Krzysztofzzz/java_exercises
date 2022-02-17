package com.zubrycky.lesson.lesson22_lazy;

import static com.zubrycky.utils.Utils.print;

public class Lesson22Lazy implements Runnable{

    @Override
    public void run() {
        CategoryEager categoryEager = new CategoryEager();
        print(categoryEager);
        categoryEager.getAuctions();
        print(categoryEager);

        CategoryLazy categoryLazy = new CategoryLazy();
        print(categoryLazy);
        categoryLazy.getAuctions();
        print(categoryLazy);
    }
}
