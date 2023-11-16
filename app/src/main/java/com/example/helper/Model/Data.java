package com.example.helper.Model;

public class Data {
    String tenTour, khoiHanh, maTour, gia;
    Integer imgUrl;

    public Integer getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(Integer imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Data(String tenTour, String khoiHanh, String maTour, String gia, Integer imgUrl) {
        this.tenTour = tenTour;
        this.khoiHanh = khoiHanh;
        this.maTour = maTour;
        this.gia = gia;
        this.imgUrl = imgUrl;
    }

    public String getTenTour() {
        return tenTour;
    }

    public void setTenTour(String tenTour) {
        this.tenTour = tenTour;
    }

    public String getKhoiHanh() {
        return khoiHanh;
    }

    public void setKhoiHanh(String khoiHanh) {
        this.khoiHanh = khoiHanh;
    }

    public String getMaTour() {
        return maTour;
    }

    public void setMaTour(String maTour) {
        this.maTour = maTour;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
}
