package com.yen;

import com.yen.core.Util;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Util util = new Util();
        System.out.println(util.add(1,2));
        System.out.println(util.substract(1,2));
        System.out.println(util.product(1,2));
        System.out.println(util.division(1,2));
    }

}