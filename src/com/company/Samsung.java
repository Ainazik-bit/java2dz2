package com.company;

public class Samsung extends Phone implements Printable{

    private String color ;

    public Samsung(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void Print() {
        System.out.println("Название " + getName() + "\nЦена " + getPrice() + "\nЦвет " +color);


    }
}
