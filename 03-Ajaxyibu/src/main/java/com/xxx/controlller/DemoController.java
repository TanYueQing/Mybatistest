package com.xxx.controlller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xxx.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @RequestMapping("/demo01")
    @ResponseBody
    public String demo01(String name,int age){
        System.out.println("name = [" + name + "], age = [" + age + "]");
        String result="";
        return result;
    }

    @RequestMapping("/demo02")
    @ResponseBody
    public String demo02(User user){
        System.out.println("user对象："+user);
        String result="SUCCESS!";
        return result;
    }

    @RequestMapping("/demo03")
    @ResponseBody
    public User demo03(User user) throws JsonProcessingException {
        System.out.println("user对象："+user);
//        ObjectMapper objectMapper = new ObjectMapper();
//        String jsonUser=objectMapper.writeValueAsString(user);

        return user;
    }
    @RequestMapping("/demo04")
    @ResponseBody
    public String demo04(User user) throws JsonProcessingException {
        System.out.println("user对象："+user);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonUser=objectMapper.writeValueAsString(user);

        return jsonUser;
    }

    @RequestMapping("/demo05")
    @ResponseBody
    public String demo05( @RequestBody String json){
        System.out.println("json = [" + json + "]");
        String result="";
        return result;
    }

    @RequestMapping("/demo06")
    @ResponseBody
    public String demo06( @RequestBody User user){
        System.out.println("json user = [" + user + "]");
        String result="";
        return result;

     /**跨域请求 三个有一个不同就会跨域
        协议
        端口
        host

      */
    }
}
