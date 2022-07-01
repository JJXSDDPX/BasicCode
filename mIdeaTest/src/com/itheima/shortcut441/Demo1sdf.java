package com.itheima.shortcut441;

//import java.util.Scanner;

import java.util.Scanner;

public class Demo1sdf {
    public static void main(String[] args) {
//        StringBuilder str = new StringBuilder();
        long start = System.currentTimeMillis();
        String str = "sdaf";
//        str = str;
        for (int i = 0; i < 100000; i++) {
            str += i;
        }
//        System.out.println(str);
        System.out.println(System.currentTimeMillis() - start);
        System.out.println("test风之");
    }
}
