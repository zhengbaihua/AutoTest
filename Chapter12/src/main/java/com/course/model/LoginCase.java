package com.course.model;

import lombok.Data;

/**
 * @author zbh
 * @date 2020/6/22 11:14
 */
@Data
public class LoginCase {
    private int id;
    private String userName;
    private String password;
    private String expected;
}
