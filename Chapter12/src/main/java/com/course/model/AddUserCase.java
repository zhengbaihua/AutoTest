package com.course.model;

import lombok.Data;

/**
 * @author zbh
 * @date 2020/6/22 11:09
 */
@Data
public class AddUserCase {
    private String userName;
    private String password;
    private String sex;
    private String age;
    private String permission;
    private String isDelete;
    private String expected;
}
