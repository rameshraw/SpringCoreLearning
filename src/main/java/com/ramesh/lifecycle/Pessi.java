package com.ramesh.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pessi implements InitializingBean,DisposableBean{
    private  int price;

    public Pessi() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pessi{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(" inside the init method of pessi");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("pessi is destroying");
    }
}
