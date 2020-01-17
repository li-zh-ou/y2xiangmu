package com.accp.domain;

public class User {
    private Integer userid;

    private String loginname;

    private String password;

    private String yuanno;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getYuanno() {
        return yuanno;
    }

    public void setYuanno(String yuanno) {
        this.yuanno = yuanno;
    }
}