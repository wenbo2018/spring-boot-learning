package com.github.wenbo2018.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author : wenbo.shen
 * @date : 2018/6/22
 */
public class CyclicBarrierUsing {

    private static CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new TestThread().start();
        }
    }

    static class TestThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "达到屏障");
            try {
                cyclicBarrier.await();
                System.out.println(Thread.currentThread().getName() + "离开屏障");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

}
