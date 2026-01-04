package com.mybatis.dao;

import com.mybatis.pojo.Cdata;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface Cdatadao  {

    public ArrayList<Cdata> queryById(@Param("tid") int tid);
    public void add(Cdata cdata);
    public int dele(@Param("tid") int tid);

}
