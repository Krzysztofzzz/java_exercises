package com.zubrycky.lesson.lesson_15_generic;

import java.util.ArrayList;
import java.util.List;

public class StackImpl<Type> implements Stack<Type> {
    private final List<Type> list;

    public StackImpl() {
        this.list = new ArrayList<>();
    }

    @Override
    public void push(Type zmienna) {
        list.add(zmienna);
    }

    @Override
    public Type pop() throws StackIsEmptyException {
        if (list.isEmpty()) {
            throw new StackIsEmptyException();
        } else {
            return list.remove(list.size() - 1);
        }
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public Type peek() throws StackIsEmptyException {
        if (list.isEmpty()) {
            throw new StackIsEmptyException();
        } else {
            return list.get(list.size() - 1);
        }
    }
}
