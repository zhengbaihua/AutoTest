package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author zbh
 * @date 2020/6/18 15:55
 */
public class ParameterTest {
    @Test
    @Parameters({"name","age"})
    public void paramTest(String name,int age){
        System.out.println("name=" + name + ",age=" + age);

    }

}
