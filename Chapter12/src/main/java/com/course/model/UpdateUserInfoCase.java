package com.course.model;

import lombok.Data;

/**
 * @author zbh
 * @date 2020/6/22 11:15
 */
@Data
public class UpdateUserInfoCase {
    private int id;
    private int userId;
    private String userName;
    private String age;
    private String sex;
    private String permission;
    private String isDelete;
    private String expected;
}
