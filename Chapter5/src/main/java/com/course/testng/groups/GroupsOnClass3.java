package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author zbh
 * @date 2020/6/18 13:52
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("GroupsOnClass3中的teacher1");
    }
    public void teacher2(){
        System.out.println("GroupsOnClass3中的teacher2");
    }
}
