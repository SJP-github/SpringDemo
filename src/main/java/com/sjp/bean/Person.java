package com.sjp.bean;

public class Person {

    /**
     * 使用@Value赋值
     *      1.直接赋值
     *      2.使用SpEl #{}
     *      3.从外部配置文件中读取${}
     */
    private String name;

    private Integer age;

    private String nickName;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, Integer age, String nickName) {
        this.name = name;
        this.age = age;
        this.nickName = nickName;
    }
}
