package com.github.wenbo2018.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wenbo.shen on 2018/5/8.
 */
public class executor {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        executor.submit(() -> {
            System.out.println(110);
        });
    }


}
