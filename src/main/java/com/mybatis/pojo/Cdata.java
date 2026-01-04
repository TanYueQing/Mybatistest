package com.mybatis.pojo;

public class Cdata {
    private int tid;
    private int currentDay;


    public int getTid() {
        return tid;
    }

    public int getCurrentDay() {
        return currentDay;
    }


    public void setTid(int tid) {
        this.tid = tid;
    }

    public void setCurrentDay(int currentDay) {
        this.currentDay = currentDay;
    }

    @Override
    public String toString() {
        return "CData{" +
                "tid=" + tid +
                ", currentDay=" + currentDay +
                '}';
    }
}
