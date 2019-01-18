package com.github.wenbo2018.web;

import com.github.wenbo2018.dao.UserDao;
import com.github.wenbo2018.dto.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by shenwenbo on 2017/4/14.
 */
@Controller
@Api(value = "User控制器")
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserDao userDao;


    @RequestMapping("/")
    @ResponseBody
    String home() {
        User user = new User();
        user.setAu(0);
        user.setEmail("wenboing.shen@gmail,com");
        user.setPassword("222");
        user.setUsername("ddd");
        user.setStatus(1);
        userDao.add(user);
        User user2 = userDao.load(581);
        return user2.toString();
    }


    @ApiOperation(value = "根据用户id查询用户信息", httpMethod = "GET", produces = "application/json")
    @ApiResponse(code = 200, message = "success", response = User.class)
    @RequestMapping("/load")
    @ResponseBody
    User loadUser(@ApiParam(name = "userId", required = true, value = "用户Id")
                          int userId) {
        User user = new User();
        user.setAu(0);
        user.setEmail("wenboing.shen@gmail,com");
        user.setPassword("222");
        user.setUsername("ddd");
        user.setStatus(1);
        userDao.add(user);
        User user2 = userDao.load(581);
        return user2;
    }

    @RequestMapping("/ftl")
    public String testFreeMaker() {
        return "index";
    }
}
