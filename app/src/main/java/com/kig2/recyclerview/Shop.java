package com.kig2.recyclerview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shop {
    private  String name;
    private Integer countShops;
    private String address;
    private String saleOf;
    private Integer price;
    private String promotion;
    private Integer image;
    private boolean isOnline;

    public Shop(String name, Integer countShops, String address, String saleOf, Integer price, String promotion, Integer image, boolean isOnline) {
        this.name = name;
        this.countShops = countShops;
        this.address = address;
        this.saleOf = saleOf;
        this.price = price;
        this.promotion = promotion;
        this.image = image;
        this.isOnline = isOnline;
    }
    public static List<Shop> getMock(){
        return  new ArrayList<>(Arrays.asList(
                new Shop("7 - eleven : Cửa hàng tiện lợi",50 ,"" ,"Tối thiểu 20k",10,"Deal giảm tới 15k",R.drawable.h,true),
                new Shop("Big C",30 ,"" ,"Tối thiểu 20k",15,"Deal giảm tới 15k",R.drawable.a,false),
                new Shop("Circle K",20 ,"" ,"Tối thiểu 10k",20,"Deal giảm tới 15k",R.drawable.b,true),
                new Shop("Cooky market",1 ,"198 Nguyễn Văn Nghi, P.7, Gò Vấp, TP. HCM" ,"Tối thiểu 20k",10,"Deal giảm tới 15k",R.drawable.c,true),
                new Shop("Coop - food",15 ,"" ,"Tối thiểu 30k",10,"Deal giảm tới 15k",R.drawable.d,false)
        ));
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCountShops() {
        return countShops;
    }

    public void setCountShops(Integer countShops) {
        this.countShops = countShops;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSaleOf() {
        return saleOf;
    }

    public void setSaleOf(String saleOf) {
        this.saleOf = saleOf;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

}
