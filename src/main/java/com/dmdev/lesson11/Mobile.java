package com.dmdev.lesson11;

public class Mobile extends Computer{
    public Mobile(Ssd ssd,Ram ram){
        super(ssd,ram);
    }
    public void load(){
        System.out.println("Я включился");
    }
}
