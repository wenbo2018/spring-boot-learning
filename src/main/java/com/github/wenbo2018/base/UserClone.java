package com.github.wenbo2018.base;

import lombok.Data;

import java.util.List;

/**
 * Created by shenwenbo on 2018/7/4.
 */
@Data
public class UserClone implements Cloneable {

    private String name;
    private Long age;
    private UserClone2 kaoshi;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        UserClone userClone= (UserClone) super.clone();
        userClone.setKaoshi((UserClone2) kaoshi.clone());
        return userClone;
    }


}
