package com.course.controller;

import com.course.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zbh
 * @date 2020/6/21 10:18
 */
@Log4j
@RestController
@Api(value = "v1",description = "这是我都第一个版本的demo")
@RequestMapping("v1")
public class Demo {

    //首先获取一个执行sql语句的对象

    @Autowired
    private SqlSessionTemplate template;

    @RequestMapping(value = "/getUserCount",method = RequestMethod.GET)
    @ApiOperation(value = "可以获取到用户数",httpMethod = "GET")
    public int getUserCount(){
//        System.out.println("Hello word!");
        return template.selectOne("getUserCount");

    }

    /**
     * 插入
     * @param user
     * @return
     */
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public int addUser(@RequestBody User user){
        int result = template.insert("addUser",user);
        return result;

    }

    /**
     * 修改
     * @param user
     * @return
     */
    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public int updateUser(@RequestBody User user){

        int result = template.update("updateUser",user);
        return result;
    }

    /**
     * 删除
     * @param
     * @return
     */
    @RequestMapping(value = "/deleteUser",method = RequestMethod.DELETE)
    public int deleteUser(@RequestParam int id){
        int result = template.delete("deleteUser",id);
        return result;
    }

}
