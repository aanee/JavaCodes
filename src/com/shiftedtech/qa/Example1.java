package com.shiftedtech.qa.study;

public class Example1 extends Object {
    public String name;
    public int number;

    public Example1 (){
        name = "Smith";
        number = 10;
    }

 public static void main(String[] args) {
        Example1 obj = new Example1();
         System.out.println(obj.name);
         System.out.println(obj.number);

 }
}
