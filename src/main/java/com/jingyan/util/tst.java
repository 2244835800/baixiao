package com.jingyan.util;

public class tst {
    public static void main(String[] args) {
        String[] aa = "aaa[br]bbb[br]ccc".split("\\[br]");

        //String[] aa = "aaa|bbb|ccc".split("\\|"); 这样才能得到正确的结果

        for (int i = 0 ; i <aa.length ; i++ ) {

            System.out.println("--"+aa[i]);

        }
    }
}
