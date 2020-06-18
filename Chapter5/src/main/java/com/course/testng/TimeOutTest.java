package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author zbh
 * @date 2020/6/18 18:23
 */
public class TimeOutTest {
    @Test(timeOut = 3000)//单位为毫秒
    public void testSuccess() throws InterruptedException{
        Thread.sleep(2000);
    }
    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException{
        Thread.sleep(3000);

    }
}
