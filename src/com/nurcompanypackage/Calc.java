package com.nurcompanypackage;

import jdk.internal.dynalink.beans.StaticClass;

public class Calc {
    //Static and non-static variables
    String name = "TestName";
    static int age = 30;

    //static method
    public static void main(String[] args) {
        // write your code here
        Calc c = new Calc();
        c.sum();
        System.out.println(c.sum(10));
        Calc.sum1();
        System.out.println(age);
        System.out.println(Calc.age);
    }
    //non-static method
    public void sum() {
        int num1 = 10;
        int num2 = 20;
        int add = num1 + num2;
        System.out.println(add);
    }

    public int sum(int x) {
        int num11 = 10;
        int num22 = 100;
        int add1 = num11 + num22;
        return add1;
        //System.out.println(add1);
    }

    //static method
    public static void sum1(){
        System.out.println("static method");
    }
}
