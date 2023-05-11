package com.dmdev.lesson11;

public final class Laptop extends Computer {
    private int weight;


    public Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
    }

    public Laptop() {
        System.out.println("Constructor laptop");
    }

    @Override
    public void load() {
        open();
        System.out.println("Я загрузился");
    }
    public void print(){
        super.print();
        System.out.println("weight: "+weight);;
    }

    public void open() {
        System.out.println("Открыл крышку");
    }

    public int getWeight() {
        return weight;
    }
}
