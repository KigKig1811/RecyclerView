package com.kig2.recyclerview;

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
