package com.github.wenbo2018.concurrent;

import com.github.wenbo2018.dto.User;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by wenbo.shen on 2018/5/8.
 */
public class AtomicReferenceUsing {


    public static void main(String[] args) {

        User user = new User("shen", "123", 100);

        AtomicReference<User> atomicReferenceUser = new AtomicReference(user);


        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                if (atomicReferenceUser.compareAndSet(user, new User("shen", "123", 500))) {
                    System.out.println("线程" + user.toString());
                }
            }).start();
        }

    }


}
