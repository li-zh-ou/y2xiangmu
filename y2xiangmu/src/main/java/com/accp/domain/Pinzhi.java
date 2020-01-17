package com.accp.domain;

import java.util.Date;

public class Pinzhi {
    private Integer pinzhiid;

    private Integer number;

    private String requeir;

    private Date ender;

    public Integer getPinzhiid() {
        return pinzhiid;
    }

    public void setPinzhiid(Integer pinzhiid) {
        this.pinzhiid = pinzhiid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getRequeir() {
        return requeir;
    }

    public void setRequeir(String requeir) {
        this.requeir = requeir;
    }

    public Date getEnder() {
        return ender;
    }

    public void setEnder(Date ender) {
        this.ender = ender;
    }
}