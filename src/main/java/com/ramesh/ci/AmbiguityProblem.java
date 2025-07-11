package com.ramesh.ci;



public class AmbiguityProblem {
    private  int a;
     private int b;

    public AmbiguityProblem(double a, double b) {
        System.out.println("calling the double double ");
        this.a = (int) a;
        this.b =(int) b;
    }
    public AmbiguityProblem(int a, int b) {
        System.out.println("calling the int int ");
        this.a = a;
        this.b = b;
    }

    public AmbiguityProblem(String a , String b){
        System.out.println("calling the string string ");
        this.a=Integer.parseInt(a);
        this.b=Integer.parseInt(b);
    }
    public void dosum(){
        System.out.println("value of a :"+this.a);
        System.out.println("value of b :"+this.b);
        System.out.println("sum:"+(this.a+this.b));
    }

}
