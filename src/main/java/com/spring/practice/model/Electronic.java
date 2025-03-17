// Electronic.java (자식 클래스)
package com.spring.practice.model;

public class Electronic extends Product {
    private String brand;

    public Electronic(String name, int price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public String getBrand() { return brand; }

    @Override
    public String toString() {
        return super.toString() + ", 브랜드: " + brand;
    }
}
