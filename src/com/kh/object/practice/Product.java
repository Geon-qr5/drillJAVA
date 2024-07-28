package com.kh.object.practice;

public class Product {
    private String id;
    private String name;
    private String site;
    private int price;
    private double tax;

    public Product() {

    }

    public Product(String id, String name, String site, int price, double tax) {
        this.id = id;
        this.name = name;
        this.site = site;
        this.price = price;
        this.tax = tax;
    }

    public String information() {
        return id + " " + name + " " + site + " " + price + " " + tax;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String taxPrice() {
        int i = (int) (price + price * tax);
        return "상품명 = " + name + "\n부가세 포함 가격 = " + i + "원";
    }
}
