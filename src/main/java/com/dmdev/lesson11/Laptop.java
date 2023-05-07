package com.dmdev.lesson11;

public class Laptop extends Computer{
    private int weight;
    public Laptop(Ssd ssd, Ram ram,int weight) {
        super(ssd, ram);
        this.weight = weight;
    }
    public void  open(){
        System.out.println("Открыл крышку");
    }

    public int getWeight() {
        return weight;
    }
}
