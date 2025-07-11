package com.ramesh.lifecycle;

public class Samosa {
    private int price ;
    public  Samosa() {};

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void init(){
        System.out.println("Init method is called");
    }
    public void destroy(){
        System.out.println("destroy method is called");
    }
}
