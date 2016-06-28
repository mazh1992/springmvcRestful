package com.smzdm.domin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by mazhenhua on 2016/6/27.
 */
public class UserInfo implements Serializable {

    private static final long serialVersionUID = -5461373449802431627L;
    private String userName;
    private BigDecimal salary;
    private Date birthday;
    private boolean isVip;
    private int id;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean isVip) {
        this.isVip = isVip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}