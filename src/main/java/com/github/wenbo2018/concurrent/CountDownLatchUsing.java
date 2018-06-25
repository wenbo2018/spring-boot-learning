package com.github.wenbo2018.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * Created by shenwenbo on 2018/6/23.
 */
public class CountDownLatchUsing {

    private static CountDownLatch countDownLatch = new CountDownLatch(5);


    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            new Testthread().start();
        }
        countDownLatch.await();
        System.out.println("主线程执行");

    }


    static class Testthread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "执行完毕");
            countDownLatch.countDown();
        }
    }

}
