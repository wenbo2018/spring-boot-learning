package com.github.wenbo2018.base;

import lombok.Data;

import java.util.List;

/**
 * Created by shenwenbo on 2018/7/4.
 */
@Data
public class UserClone2 implements Cloneable {


    private String kaoshi;

    public UserClone2(String kaoshi) {
        this.kaoshi = kaoshi;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
