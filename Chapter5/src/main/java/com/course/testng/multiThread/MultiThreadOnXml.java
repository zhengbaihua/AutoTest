package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @author zbh
 * @date 2020/6/18 17:25
 */
public class MultiThreadOnXml {
    @Test
    public void test1(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
