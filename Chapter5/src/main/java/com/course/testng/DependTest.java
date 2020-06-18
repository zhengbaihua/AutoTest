package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author zbh
 * @date 2020/6/18 14:46
 */
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
