package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Samsung");
        createObject("Apple");
        createObject("Xiaomi");

    }

    public static Phone createObject(String className) {
        switch (className) {
            case ("Samsung"):
                return new Samsung("A71",25,"Hameleon").Print();
            case ("Apple"):
                return new Apple("7+",26,256).Print();
            case ("Xiaomi"):
                return new Xiaomi("Redmi 9",24,"Android 10").Print();
        }
        return new Phone();

    }
}
