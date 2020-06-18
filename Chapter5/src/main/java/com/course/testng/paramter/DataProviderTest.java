package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @author zbh
 * @date 2020/6/18 16:51
 */
public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name=" + name +",age=" + age);
    }
    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsn",10},
                {"lisi",20},
                {"小刘",25}

        };
        return o;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test111方法 name=" + name + ", age=" + age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2222方法 name=" + name + ", age=" + age);
    }
    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][]{
                    {"小郑", 24},
                    {"浩哥", 27},
                    {"小刘", 25}
            };
        } else if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"丽丽", 20},
                    {"琉璃", 18},
                    {"小可啊", 15},
            };
        }
        return result;
    }
}
