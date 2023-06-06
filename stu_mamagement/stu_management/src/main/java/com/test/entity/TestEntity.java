package com.test.entity;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;


public class TestEntity {
    private String guid; // 主键id
    private String name;
    private Integer age;
    private Boolean sex;
    private Double money;
    private Date sign_date;
    private Timestamp sign_datetime;
    private Time sign_time;
    private String desc;

    // alt+ins
    public TestEntity() { // 无参构造
    }

    public TestEntity(String guid, String name, Integer age, Boolean sex, Double money, Date sign_date, Timestamp sign_datetime, Time sign_time, String desc) {
        this.guid = guid;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.money = money;
        this.sign_date = sign_date;
        this.sign_datetime = sign_datetime;
        this.sign_time = sign_time;
        this.desc = desc;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
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

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getSign_date() {
        return sign_date;
    }

    public void setSign_date(Date sign_date) {
        this.sign_date = sign_date;
    }

    public Timestamp getSign_datetime() {
        return sign_datetime;
    }

    public void setSign_datetime(Timestamp sign_datetime) {
        this.sign_datetime = sign_datetime;
    }

    public Time getSign_time() {
        return sign_time;
    }

    public void setSign_time(Time sign_time) {
        this.sign_time = sign_time;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "guid='" + guid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", money=" + money +
                ", sign_date=" + sign_date +
                ", sign_datetime=" + sign_datetime +
                ", sign_time=" + sign_time +
                ", desc='" + desc + '\'' +
                '}';
    }
}
