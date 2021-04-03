package com.company;

public class Apple extends Phone implements Printable{

    private int memory;

    public Apple(String name, int price, int memory) {
        super(name, price);
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public void Print() {
        System.out.println("Название " + getName() + "\nЦена " + getPrice() + "\nПамять " + memory);

    }
}
