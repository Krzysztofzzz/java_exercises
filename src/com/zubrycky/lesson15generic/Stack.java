package com.zubrycky.lesson15generic;

public interface Stack<TypZmiennej> {
    void push(TypZmiennej zmienna);
    TypZmiennej pop() throws StackIsEmptyException;
    boolean isEmpty();
    TypZmiennej peek() throws StackIsEmptyException;
}
