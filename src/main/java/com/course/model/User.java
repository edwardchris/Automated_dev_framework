package com.course.model;

import lombok.Data;

/**
 * @author: huangxiang
 * @create: 2018/5/29 15:12
 * @description:
 */
@Data
public class User {

    private int id;
    private String userName;
    private String password;
    private String age;
    private String sex;
    private String permission;
    private String isDelete;


}
