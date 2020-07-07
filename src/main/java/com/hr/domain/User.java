package com.hr.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    private String uname;
    private Integer uage;
    private Date date;


    public User() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getUage() {
        return uage;
    }

    public void setUage(Integer uage) {
        this.uage = uage;
    }


    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", uage=" + uage +
                ", date=" + date +
                '}';
    }
}
