package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Samsung").Print();
        createObject("Apple").Print();
        createObject("Xiaomi").Print();

    }

    public static Phone createObject(String className) {
        switch (className) {
            case ("Samsung"):
                return new Samsung("A71",25,"Hameleon");
            case ("Apple"):
                return new Apple("7+",26,256);
            case ("Xiaomi"):
                return new Xiaomi("Redmi 9",24,"Android 10");
        }
        return new Phone();

    }
}
