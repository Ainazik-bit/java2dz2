package com.company;

public class Xiaomi extends Phone implements Printable{

    private String OS;

    public Xiaomi(String name, int price, String OS) {
        super(name, price);
        this.OS = OS;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    @Override
    public void Print() {
        System.out.println("Название " + getName() + "\nЦена " + getPrice() + "\nОперационная система " + OS);

    }
}
