package com.github.wenbo2018.concurrent.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : wenbo.shen
 * @date : 2018/6/9
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Lock theLock = new ReentrantLock();
        // 消费者用判断条件
        Condition full = theLock.newCondition();
        // 生产者用判断条件
        Condition empty = theLock.newCondition();


    }
}
