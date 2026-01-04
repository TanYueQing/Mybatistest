package com.mybatis.service;

import com.mybatis.dao.Cdatadao;
import com.mybatis.pojo.Cdata;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.annotations.Test;

import java.io.InputStream;
import java.util.ArrayList;

public interface Mybatistest {

    public ArrayList<Cdata> testQueryById(int tid);
    public void add(Cdata cdata);
    public int dele(int tid);


}




