package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @author zbh
 * @date 2020/6/18 11:40
 */
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite运行啦");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite运行啦");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("before test运行啦");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }
}
