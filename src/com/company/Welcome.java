package com.company;

public class Welcome {
    public static void main(String[] args) {
        sayHi();
        sayName();
        sayAge();
        add(3,4);
        System.out.println("Welcome to this java course Sonu");
    }
    public static void sayHi(){
        System.out.println("Hi");
    }
    public static void sayName(){
        System.out.println("Sonu kumar kushwaha");
    }
    public static void sayAge(){
        System.out.println(18);
    }
    public static void add(int a,int b){
        System.out.println(a + b);
    }
}
