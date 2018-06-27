package com.github.wenbo2018.dao;


import com.github.wenbo2018.dto.User;

import java.util.List;

/**
 * Created by shenwenbo on 2017/2/15.
 */
public interface UserDao {


    void add(User user);

    User load(int userId);

    User loadByUserName(String username);

    void delete(int userId);

    void update(User user);

    List<User> list();

    User queryByUserNameAndPassWord(String username, String password);

}
