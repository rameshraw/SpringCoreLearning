package com.ramesh.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Chiya {
    private int price;

    public Chiya() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chiya{" +
                "price=" + price +
                '}';
    }
    @PostConstruct
    public void start(){
        System.out.println("init method is calling from chiya");
    }
    @PreDestroy
    public void end(){
        System.out.println("destroy method is calling from chiya");
    }
}
