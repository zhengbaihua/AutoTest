package com.course.httpclient.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

import org.apache.http.impl.client.DefaultHttpClient;

import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author zbh
 * @date 2020/6/20 8:43
 */
public class MyHttpClient {

    @Test
    public void test1() throws IOException {
        /**
         * 4.2.5之前的版本用HttpClient client = new DefaultHttpClient();
         * 4.2.5之后的版本用CloseableHttpClient httpClient = HttpClients.createDefault();
         */

        //用来存放我们的结果
        String result;
        HttpGet get = new HttpGet("http://www.baidu.com");
        //这个是用来执行get方法的
        HttpClient client = new DefaultHttpClient();
//        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);
    }
}
