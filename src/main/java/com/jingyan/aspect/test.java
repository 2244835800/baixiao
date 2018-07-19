package com.jingyan.aspect;

public class test implements Runnable{
    private float f;

//    public static void main(String[] args) {
////        int i=30,j=30,k=30;
////        i=i++;
////        j=++j;
////        k+=k;
////        System.out.println(i+","+j+","+k);
//
//        float
//                f= 3.4f;
//        short s1 = 1;
//        s1 = s1 + 1;
//
//
//    }
    public static void main(String[] args) {
        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;

        System.out.println(f1 == f2);
        System.out.println(f3 == f4);
        System.out.println(Math.round(-2.5));

        String s= "aa"+"f三";
        System.out.println(s);

        StringBuilder sb=new StringBuilder("ff");
        System.out.println(sb);

        System.out.println(s.charAt(3));


    }

    @Override
    public void run() {

    }
}
