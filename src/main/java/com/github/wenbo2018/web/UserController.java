package com.github.wenbo2018.web;

import com.github.wenbo2018.dao.UserDao;
import com.github.wenbo2018.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;

/**
 * Created by shenwenbo on 2017/4/14.
 */
@Controller
public class UserController {
    private static Logger logger= LoggerFactory.getLogger(UserController.class);
    @Resource
    private UserDao userDao;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        User user=new User();
        user.setAu(0);
        user.setEmail("wenboing.shen@gmail,com");
        user.setPassword("222");
        user.setUsername("ddd");
        user.setStatus(1);
        userDao.add(user);
        User user2=userDao.load(581);
        return user2.toString();
    }




    @RequestMapping("/load")
    @ResponseBody
    User loadUser() {
        User user=new User();
        user.setAu(0);
        user.setEmail("wenboing.shen@gmail,com");
        user.setPassword("222");
        user.setUsername("ddd");
        user.setStatus(1);
        userDao.add(user);
        User user2=userDao.load(581);
        return user2;
    }

    @RequestMapping("/ftl")
    public String testFreeMaker() {
        return "index";
    }
}
