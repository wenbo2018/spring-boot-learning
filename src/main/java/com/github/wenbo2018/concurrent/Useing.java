package com.github.wenbo2018.concurrent;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wenbo.shen on 2018/5/6.
 */
public class Useing {


    private static Lock lock = new ReentrantLock();

    private static int count = 0;


    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                incer();
            }).start();
        }

        Thread.sleep(1000);

        System.out.println(count);

    }

    private static void incer() {
        try {
            lock.lock();
            count++;
        } finally {
            lock.unlock();
        }
    }
}
