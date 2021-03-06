package com.zubrycky.lesson.lesson_17_exceptions;

import java.io.IOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.PortUnreachableException;
import java.net.SocketException;

import static com.zubrycky.utils.Utils.print;

public class Lesson17Exceptions implements Runnable {

    @Override
    public void run() {
        final IThrowException iThrowException = new IThrowSocketException();
        try {
            iThrowException.test();
        } catch (ConnectException | BindException | PortUnreachableException e) {
            print("I cought exception: " + e);
        } catch (SocketException e) {
            print("I cought socket exception" + e);
        } catch (Exception e) {
            print("I cought exception: " + e);
        }
    }

    interface IThrowException {
        void test() throws Exception;
    }

    static class IThrowIOException implements IThrowException {

        @Override
        public void test() throws IOException {
            throw new IOException();
        }
    }

    static class IThrowSocketException extends IThrowIOException {
        @Override
        public void test() throws SocketException {
            throw new BindException();
        }
    }

    static class IThrowConnectException extends IThrowSocketException {
        @Override
        public void test() throws ConnectException {
            throw new ConnectException();
        }
    }
}
