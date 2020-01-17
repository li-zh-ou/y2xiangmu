package com.accp.domain;

import java.util.Date;

public class Sale {
    private String saleno;

    private String saletype;

    private Integer goodsid;

    private Integer goodsnumber;

    private Date saletime;

    private String kaidan;

    private String kehuno;

    private String jiesuan;

    private String huiyuanno;

    private String jiesuantype;

    private Date jiesuantime;

    private Double money;

    private String youhui;

    private String youhuitype;

    public String getSaleno() {
        return saleno;
    }

    public void setSaleno(String saleno) {
        this.saleno = saleno;
    }

    public String getSaletype() {
        return saletype;
    }

    public void setSaletype(String saletype) {
        this.saletype = saletype;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getGoodsnumber() {
        return goodsnumber;
    }

    public void setGoodsnumber(Integer goodsnumber) {
        this.goodsnumber = goodsnumber;
    }

    public Date getSaletime() {
        return saletime;
    }

    public void setSaletime(Date saletime) {
        this.saletime = saletime;
    }

    public String getKaidan() {
        return kaidan;
    }

    public void setKaidan(String kaidan) {
        this.kaidan = kaidan;
    }

    public String getKehuno() {
        return kehuno;
    }

    public void setKehuno(String kehuno) {
        this.kehuno = kehuno;
    }

    public String getJiesuan() {
        return jiesuan;
    }

    public void setJiesuan(String jiesuan) {
        this.jiesuan = jiesuan;
    }

    public String getHuiyuanno() {
        return huiyuanno;
    }

    public void setHuiyuanno(String huiyuanno) {
        this.huiyuanno = huiyuanno;
    }

    public String getJiesuantype() {
        return jiesuantype;
    }

    public void setJiesuantype(String jiesuantype) {
        this.jiesuantype = jiesuantype;
    }

    public Date getJiesuantime() {
        return jiesuantime;
    }

    public void setJiesuantime(Date jiesuantime) {
        this.jiesuantime = jiesuantime;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getYouhui() {
        return youhui;
    }

    public void setYouhui(String youhui) {
        this.youhui = youhui;
    }

    public String getYouhuitype() {
        return youhuitype;
    }

    public void setYouhuitype(String youhuitype) {
        this.youhuitype = youhuitype;
    }
}