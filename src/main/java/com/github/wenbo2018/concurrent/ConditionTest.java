package com.github.wenbo2018.concurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by shenwenbo on 2018/6/24.
 */
public class ConditionTest implements Runnable {
    private Lock lock;
    private Condition con;

    public ConditionTest(Lock lock, Condition condition) {
        this.lock = lock;
        this.con = condition;
    }

    public void run() {
        if ("thread1".equals(Thread.currentThread().getName()))
            testThreadWaiter1();
        if ("thread2".equals(Thread.currentThread().getName()))
            testThreadWaiter2();
        if ("thread".equals(Thread.currentThread().getName()))
            testThreadSingal();
    }

    public void testThreadWaiter1() {
        lock.lock();
        try {
            try {
                System.out.println("thead1被阻塞");
                con.await();
                System.out.println("thead1被唤醒");
            } catch (InterruptedException e) {
            }
        } finally {
            lock.unlock();
        }
    }


    public void testThreadWaiter2() {
        lock.lock();
        try {
            try {
                System.out.println("thead2被阻塞");
                con.await();
                System.out.println("thead2被唤醒");
            } catch (InterruptedException e) {
            }
        } finally {
            lock.unlock();
        }
    }

    public void testThreadSingal() {
        lock.lock();
        try {
            con.signal();
            System.out.println("唤醒等待线程");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        new Thread(new ConditionTest(lock, condition), "thread1").start();
        new Thread(new ConditionTest(lock, condition), "thread2").start();
        new Thread(new ConditionTest(lock, condition), "thread").start();

    }

}
