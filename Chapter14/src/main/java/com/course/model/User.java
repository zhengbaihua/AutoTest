package com.course.model;

import lombok.Data;

/**
 * @author zbh
 * @date 2020/6/23 13:28
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
