package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @author zbh
 * @date 2020/6/18 17:17
 */
public class MultiThreadOnAnnotion {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
