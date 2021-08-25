package com.nurcompanypackage;

public class MethodOverloading {

    public MethodOverloading() {

        System.out.println("Constructor");
    }

    public MethodOverloading(int j) {

        System.out.println("Constructor 2");
    }

    public static void main(String args[]) {
        MethodOverloading m = new MethodOverloading(); //constructor is called implicitly
        sum(); //calling explicity
        sum(2);
        m.sum("Noor");
        MethodOverloading.sum();

        MethodOverloading m1 = new MethodOverloading(10);

    }

    public static void sum() {
        int num1 = 10;
        System.out.println("num1");
    }

    public static void sum(int x) {
        x = 100;
        System.out.println(x);
    }

    public void sum(String y) {
        y = "Name";
        System.out.println(y);
    }
}
