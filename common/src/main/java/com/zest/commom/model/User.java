package com.zest.commom.model;

import java.io.Serializable;

/**
 * @author Zest7
 * @Email tanzhangshun@163.com
 * @github https://github.com/Zest7
 * @date 2024/3/31 22:24
 * @Description: TODO
 */
public class User implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
