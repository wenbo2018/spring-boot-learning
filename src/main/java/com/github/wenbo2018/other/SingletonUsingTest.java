package com.github.wenbo2018.other;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author wenbo.shen
 * @date 2018/5/18
 */
public class SingletonUsingTest {

    public static void main(String[] args) throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException,
            InstantiationException {
        SingletonUsing singletonUsing = SingletonUsing.getInstance();
        Constructor<SingletonUsing> constructor = SingletonUsing.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonUsing singletonUsing2 = constructor.newInstance();
        System.out.println(singletonUsing.hashCode());
        System.out.println(singletonUsing2.hashCode());
    }

}
