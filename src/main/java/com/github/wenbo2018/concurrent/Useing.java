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
        System.out.println(Integer.toBinaryString((1 >>> 16)));

    }


}
