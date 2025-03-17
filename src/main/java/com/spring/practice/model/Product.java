// Product.java (부모 클래스)
package com.spring.practice.model;

public class Product {
    protected String name;
    protected int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }

    @Override
    public String toString() {
        return "상품명: " + name + ", 가격: " + price;
    }
}
