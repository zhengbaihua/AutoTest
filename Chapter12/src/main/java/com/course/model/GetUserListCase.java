package com.course.model;

import lombok.Data;

/**
 * @author zbh
 * @date 2020/6/22 11:12
 */
@Data
public class GetUserListCase {
    private String userName;
    private String age;
    private String sex;
    private String expected;
}
