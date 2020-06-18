package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author zbh
 * @date 2020/6/18 13:52
 */
@Test(groups = "stu")
public class GroupsOnClass1 {
    public void stu1(){
        System.out.println("GroupsOnClass1中的stu1运行");
    }
    public void stu2(){
        System.out.println("GroupsOnClass1中的stu2运行");
    }
}
