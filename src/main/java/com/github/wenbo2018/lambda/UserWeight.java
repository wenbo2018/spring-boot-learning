package com.github.wenbo2018.lambda;

import com.github.wenbo2018.dto.User;

import java.util.function.Function;

/**
 * Created by wenbo.shen on 2018/5/5.
 */
public class UserWeight implements Function<User, User> {

    @Override
    public User apply(User user) {
        user.setAu(1000);
        return user;
    }

}
