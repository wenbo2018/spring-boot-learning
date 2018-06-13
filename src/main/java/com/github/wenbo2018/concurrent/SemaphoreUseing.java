package com.github.wenbo2018.concurrent;

import java.util.concurrent.Semaphore;

/**
 * Created by wenbo.shen on 2018/5/6.
 */
public class SemaphoreUseing {

    private static Semaphore semaphore = new Semaphore(1);

    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    count++;
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(count);

    }

}
