package com.company;

public class Phone {
    private String name;
    private int price;
    private int camera;
    boolean wifi;

    public Phone(String name, int price, int camera, boolean wifi) {
        this.name = name;
        this.price = price;
        this.camera = camera;
        this.wifi = wifi;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCamera() {
        return camera;
    }

    public boolean isWifi() {
        return wifi;
    }
}
