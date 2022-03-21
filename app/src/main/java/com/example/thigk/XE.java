package com.example.thigk;

import java.io.Serializable;

public class XE implements Serializable {
    private int id;
    private String ten;
    private String gia;
    private String giam;

    public XE(int id, String ten, String gia, String giam) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.giam = giam;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getGiam() {
        return giam;
    }

    public void setGiam(String giam) {
        this.giam = giam;
    }


}
