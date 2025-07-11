package com.ramesh.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{23}")
    private  int x;
    @Value("#{53}")
    private  int y;
    @Value("#{T(java.lang.Math).sqrt(25)}")
    private double z;
    @Value("#{T(java.lang.Math).PI}")
    private  double e;
    @Value("#{new String('Ramesh')}")
    private String name;
    @Value("#{true}")
    private boolean islogin;
    public double getE() {
        return e;
    }

    public String getName() {
        return name;
    }

    public boolean isIslogin() {
        return islogin;
    }

    public void setIslogin(boolean islogin) {
        this.islogin = islogin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setE(double e) {
        this.e = e;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
