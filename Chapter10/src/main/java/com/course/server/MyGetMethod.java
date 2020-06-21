package com.course.server;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author zbh
 * @date 2020/6/20 17:02
 */

@RestController
@Api(value = "/",description = "这是我全部的get方法")
public class MyGetMethod {

    @RequestMapping(value = "/getCookies",method = RequestMethod.GET)
    @ApiOperation(value = "通过这个方法可以获取到Cookies",httpMethod = "GET")
    public String getCookies(HttpServletResponse response){
        //HTTPServerletRequest 装请求信息的类
        //HTTPServerletResponse 装响应信息的类

        Cookie cookie = new Cookie("ligin","true");
        response.addCookie(cookie);

        return "恭喜你获得cookies信息成功";
    }

    /**
     * 要求客户端携带cookies访问
     * 这是一个需要携带cookies信息才能访问的get请求
     */
    @RequestMapping(value = "/get/with/cookies",method = RequestMethod.GET)
    @ApiOperation(value = "要求客户端携带cookies访问",httpMethod = "GET")
    public String getWithCookies(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if(Objects.isNull(cookies)){
            return  "你必须携带cookies信息来";
        }
        //验证cookies
        for (Cookie cookie : cookies){
            if (cookie.getName().equals("login") &&
            cookie.getValue().equals("true")){
                return "这是一个需要携带cookies信息才能访问的get请求";
            }
        }


        return  "你必须携带cookies信息来";
    }

    /**
     * 开发一个需要携带参数才能访问的get请求
     * 第一种实现方式：url : key =value&key=value
     * 我们来模拟获取商品列表
     */
    @RequestMapping(value = "/get/with/param",method = RequestMethod.GET)
    @ApiOperation(value = "要求携带参数才能访问的get请求方法一",httpMethod = "GET")
    public Map<String,Integer> getList(@RequestParam Integer start,
                                       @RequestParam Integer end){
        Map<String ,Integer> myList = new HashMap<>();

        myList.put("凉鞋",200);
        myList.put("连衣裙",150);
        myList.put("干脆面",5);
        myList.put("西瓜",25);
        myList.put("项链",1000);

        return myList;

    }
    /**
     * 第二种需要携带参数访问的get请求
     * url:ip:port/get/get/with/param/10/20
     */
    @RequestMapping(value = "/get/with/param/{start}/{end}")
    @ApiOperation(value = "要求携带参数才能访问的get请求方法二",httpMethod = "GET")
    public Map myGetList(@PathVariable Integer start,
                         @PathVariable Integer end){

        Map<String,Integer> myList = new HashMap<>();
        myList.put("凉鞋",200);
        myList.put("连衣裙",150);
        myList.put("干脆面",5);
        myList.put("西瓜",25);
        myList.put("项链",1000);

        return myList;


    }
}
