package com.mybatis.Imp;

import com.mybatis.service.Mybatistest;
import com.mybatis.dao.Cdatadao;
import com.mybatis.pojo.Cdata;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.ArrayList;

public class CdatadaoImp implements Mybatistest {

    public Cdatadao cdatadao;

    @Override
    public ArrayList<Cdata> testQueryById(int tid) {
        ArrayList<Cdata> cdataq = cdatadao.queryById(tid);
        System.out.println(cdataq.toString());
        for(Cdata cdata:cdataq){
            System.out.println(cdata.toString());

        }

        return cdataq;
    }

    @Override
    public void add(Cdata cdata) {
           cdatadao.add(cdata);
    }

    @Override
    public int dele(int tid) {
        return cdatadao.dele(tid);
    }

    public void setCdatadao(Cdatadao cdatadao) {
        this.cdatadao = cdatadao;
    }

    public Cdatadao getCdatadao() {
        return cdatadao;
    }
}
