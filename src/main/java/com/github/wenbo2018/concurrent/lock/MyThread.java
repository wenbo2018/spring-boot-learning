package com.github.wenbo2018.concurrent.lock;

/**
 * @author : wenbo.shen
 * @date : 2018/6/9
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            System.out.println("响应了中断");
            e.printStackTrace();
        }
    }
}
