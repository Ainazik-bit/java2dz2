package com.company;

public class Phone implements Printable{

    private String name;
    private int price;

    public Phone() {
    }

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void Print() {
        System.out.println("Название " + getName() + "\nЦена "+ price);

    }
}