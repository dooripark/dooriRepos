// Food.java (자식 클래스)
package com.spring.practice.model;

public class Food extends Product {
    private String expirationDate;

    public Food(String name, int price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() { return expirationDate; }

    @Override
    public String toString() {
        return super.toString() + ", 유통기한: " + expirationDate;
    }
}
