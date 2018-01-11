package com.mehmetunluu.ajax.ajaxdemo.model;

import java.io.Serializable;

/**
 * Created by TCMEUNLU on 1/10/2018.
 */
public class Personel implements Serializable {

    public Personel(String ad, String soyAd, String departman) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.departman = departman;
    }

    private String ad;
    private String soyAd;
    private String departman;


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
