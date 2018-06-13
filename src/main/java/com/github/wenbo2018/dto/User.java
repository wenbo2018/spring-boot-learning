package com.github.wenbo2018.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by shenwenbo on 2017/4/14.
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = -7091478494529379221L;

    public User() {

    }

    public User(String username, String password, int status) {
        this.username = username;
        this.password = password;
        this.status = status;
    }

    private int id;
    private String username;
    private String password;
    private int au;
    private String email;
    private int status;

}
