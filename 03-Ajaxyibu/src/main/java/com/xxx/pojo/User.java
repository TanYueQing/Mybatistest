package com.xxx.pojo;

import org.springframework.stereotype.Component;

@Component
public class User {
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String name;


    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
