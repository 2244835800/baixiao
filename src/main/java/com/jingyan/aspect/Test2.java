package com.jingyan.aspect;

class A {
    String name="jack";
    static {
        System.out.print("1");
    }

    public A() {
        System.out.print("2");
    }
    public void method1(){
        System.out.println("method1");
    }
}

class B extends A{

    static {
        System.out.print("a");
    }

    public B() {
        System.out.print("b");
    }

    public void method1(){
        System.out.println("method2");
    }
}

public class Test2 {

    public static void main(String[] args) {
        A ab = new B();
//        ab = new B();

        ab.method1();
        System.out.println(ab.name);
    }

}