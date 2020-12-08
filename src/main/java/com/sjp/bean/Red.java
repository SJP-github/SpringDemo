package com.sjp.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: sjp
 * @Date : Created in 2020/12/8
 * @Description:
 */

public class Red {

    private String redDesc;
    private Integer num;

    @PostConstruct
    public void init() {
        System.out.println("exec init()");
    }

    @PreDestroy
    public void destory() {
        System.out.println("exec destory");
    }

    public Red() {
    }

    @Override
    public String toString() {
        return "Red{" +
                "redDesc='" + redDesc + '\'' +
                ", num=" + num +
                '}';
    }

    public String getRedDesc() {
        return redDesc;
    }

    public void setRedDesc(String redDesc) {
        this.redDesc = redDesc;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
