package com.github.wenbo2018.other;


/**
 * Created by wenbo.shen on 2018/5/18.
 */
public class SingletonUsing {

    private static int count = 0;

    private SingletonUsing() {

        synchronized (SingletonUsing.class) {
            if (count > 0) {
                throw new RuntimeException("创建了两个实例");
            }
        }
        count++;

    }

    static class SingletonCreate {
        private static SingletonUsing singleton = new SingletonUsing();
    }

    public static SingletonUsing getInstance() {
        return SingletonCreate.singleton;
    }

}
