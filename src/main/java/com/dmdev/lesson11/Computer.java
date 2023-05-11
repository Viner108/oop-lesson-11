package com.dmdev.lesson11;

public abstract class Computer {
    private Ssd ssd;

    private Ram ram;



    public Computer(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public Computer() {
        System.out.println("Constructor computer");
    }

    public abstract void load();

public void print(){
    System.out.println("Ssd: "+ssd.getValue()+", ram: " +ram.getValue());
}
    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam() {
        return ram;
    }
}
