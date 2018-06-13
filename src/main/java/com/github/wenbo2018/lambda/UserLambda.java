package com.github.wenbo2018.lambda;


import com.github.wenbo2018.dto.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by wenbo.shen on 2018/5/3.
 */
public class UserLambda {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        userList.add(new User("shenwenbo", "123456", 1));
        userList.add(new User("sssk", "wwww", 1));
        userList.add(new User("bbs", "sss", 0));
        userList.stream().forEach(user -> {
            System.out.println(user.getUsername());
        });
        userList.stream()
                .filter(user -> user.getStatus() == 1)
                .forEach(user -> {
                    System.out.println(user.getUsername());
                });
        new Thread(() -> {
            System.out.println(1);
        });

        Comparator<User> c = Comparator.comparing((User a) -> a.getId());
    }

}


