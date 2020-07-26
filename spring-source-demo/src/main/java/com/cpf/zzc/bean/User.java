package com.cpf.zzc.bean;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;
    private int age;
    // class.newInstance()
    public User() {
        System.out.println("new User()");
    }
    public User(Fox fox) {
        System.out.println("new User(Fox fox)");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
