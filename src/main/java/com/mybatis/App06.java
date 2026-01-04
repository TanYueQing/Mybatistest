package com.mybatis;

import com.mybatis.service.Mybatistest;
import com.mybatis.pojo.Cdata;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App06 {
    public static void main(String[] arg){
        ApplicationContext ctx =new ClassPathXmlApplicationContext("applicationContext.xml");
        Mybatistest mybatistest=(Mybatistest)ctx.getBean("mybatistest");

        Cdata cdata=new Cdata();
        cdata.setTid(3);
        cdata.setCurrentDay(5);

//        mybatistest.testQueryById(2);
        mybatistest.add(cdata);
      //  mybatistest.dele(1);
    }
}
