package com.zubrycky.lesson.lesson_15_generic;

public interface Stack<TypZmiennej> {
    void push(TypZmiennej zmienna);

    TypZmiennej pop() throws StackIsEmptyException;

    boolean isEmpty();

    TypZmiennej peek() throws StackIsEmptyException;
}
